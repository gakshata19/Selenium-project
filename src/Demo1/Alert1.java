package Demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1  {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("http://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	WebElement wb= driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button"));
	wb.click();
	Alert act=driver.switchTo().alert();
	String a=act.getText();
	System.out.println(a);
	Thread.sleep(2000);
	act.dismiss();
	
	Thread.sleep(2000);
	driver.close();
	}
}
