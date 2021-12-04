package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup  {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/akshatag/Downloads/alertPopUp.html");
	WebElement wb=driver.findElement(By.name("uname"));
	wb.sendKeys("Akshata");
	Thread.sleep(4000);
	wb= driver.findElement(By.xpath("/html/body/div/button"));
	wb.click();
	Alert act=driver.switchTo().alert();
	String a=act.getText();
	System.out.println(a);
	//act.sendKeys("Pune");

	Thread.sleep(4000);
	act.accept();
	
	String b=act.getText();
	if(b.contains("Blank")) {
		System.out.println("Text field is blank");
	}
	else
		System.out.println("Text field is not blank");
	Thread.sleep(4000);
	act.accept();
	Thread.sleep(4000);
	driver.close();
	
	}

}
