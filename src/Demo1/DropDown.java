package Demo1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg");
		
		WebElement day=driver.findElement(By.id("day"));
		Select s1= new Select(day);
		s1.selectByVisibleText("1");
		WebElement sday	=s1.getFirstSelectedOption();
		String a=sday.getText();
		System.out.println("Selected day is: "+a);
		List<WebElement> lday=s1.getOptions();
		int a1=lday.size();
		System.out.println("Total number of days is: "+a1);
		for(WebElement i:lday) {
			System.out.println(i.getText());
		}
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByIndex(9);
		WebElement smonth=s2.getFirstSelectedOption();
		String b=smonth.getText();
		System.out.println("Selected month is: "+b);
		List<WebElement> lmonth=s2.getOptions();
		int b2=lmonth.size();
		System.out.println("Total number of months is: "+b2);
		for(WebElement j:lmonth) {
			System.out.println(j.getText());
		}
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1994");
		WebElement syear=s3.getFirstSelectedOption();
		String c=syear.getText();
		System.out.println("Selected year is: "+c);
		List<WebElement> lyear=s3.getOptions();
		int c2=lyear.size();
		System.out.println("Total number of years is: "+c2);
		for(WebElement k:lyear) {
			System.out.println(k.getText());
		}
		driver.close();
	}

}
