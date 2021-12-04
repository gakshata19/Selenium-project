package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class CreateAccPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg");
		
		WebElement wa=driver.findElement(By.cssSelector("#u_0_j_Zj"));
		wa.sendKeys("Akshata");
		System.out.println("First Name: "+wa.getText());
		
		WebElement wb=driver.findElement(By.id("u_0_l_Oa"));
		wb.sendKeys("Gaikwad");
		System.out.println("First Name: "+wb.getText());
		
		WebElement wc=driver.findElement(By.id("u_0_o_P1"));
		wc.sendKeys("Akshata");
		System.out.println("First Name: "+wc.getText());
		
		WebElement wd=driver.findElement(By.id("password_step_input"));
		wd.sendKeys("Akshata");
		System.out.println("First Name: "+wd.getText());
		
		WebElement day=driver.findElement(By.id("day"));
		Select s1= new Select(day);
		s1.selectByVisibleText("1");
		WebElement sday	=s1.getFirstSelectedOption();
		String a=sday.getText();
		System.out.println("Selected day is: "+a);
		List<WebElement> lday=s1.getOptions();
		int a1=lday.size();
		System.out.println("Total number of days is: "+a1);
		
		WebElement month=driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByIndex(9);
		WebElement smonth=s2.getFirstSelectedOption();
		String b=smonth.getText();
		System.out.println("Selected month is: "+b);
		List<WebElement> lmonth=s2.getOptions();
		int b2=lmonth.size();
		System.out.println("Total number of months is: "+b2);
		
		WebElement year=driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("1994");
		WebElement syear=s3.getFirstSelectedOption();
		String c=syear.getText();
		System.out.println("Selected year is: "+c);
		List<WebElement> lyear=s3.getOptions();
		int c2=lyear.size();
		System.out.println("Total number of years is: "+c2);
		
		WebElement w=driver.findElement(By.xpath("//*[@id=\"u_0_w_TL\"]/span[1]/label"));
		System.out.println("Radio button is displayed: "+w.isDisplayed());
		System.out.println("Radio button is enabled: "+w.isEnabled());
		System.out.println("Radio button is selected: "+w.isSelected());
		w.click();
		System.out.println("Radio button is selected: "+w.isSelected());
		
		driver.close();
	}
}
