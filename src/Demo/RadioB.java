package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/radio.html");
		WebElement wa=driver.findElement(By.xpath("//*[@id=\"male\"]"));
		String e=driver.findElement(By.xpath("/html/body/form/label[1]")).getText();
		System.out.println("Text of 1st radio button is: "+e);
		boolean a=wa.isEnabled();
		System.out.println("1st radio button is enabled? "+a);
		boolean b=wa.isDisplayed();
		System.out.println("1st radio button is displayed? "+b);
		boolean c=wa.isSelected();
		System.out.println("1st radio button is selected? "+c);
		wa.click();
		boolean d=wa.isSelected();
		System.out.println("1st radio button is selected? "+d);
		
		Thread.sleep(2000);
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"female\"]"));
		String e1=driver.findElement(By.xpath("/html/body/form/label[2]")).getText();
		System.out.println("Text of 2nd radio button is: "+e1);
		boolean a1=wb.isEnabled();
		System.out.println("2nd radio button is enabled? "+a1);
		boolean b1=wb.isDisplayed();
		System.out.println("2nd radio button is displayed? "+b1);
		boolean c1=wb.isSelected();
		System.out.println("2nd radio button is selected? "+c1);
		wb.click();
		boolean d1=wb.isSelected();
		System.out.println("2nd radio button is selected? "+d1);
		
		boolean f=wa.isSelected();
		System.out.println("1st radio button is selected? "+f);
		Thread.sleep(2000);
		driver.close();
	}

}
