package Demo1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/alertPopUp.html");
		driver.findElement(By.name("uname")).sendKeys("Java");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		Alert act=driver.switchTo().alert();
		System.out.println(act.getText());
		act.sendKeys("Selenium");
		act.dismiss();
		
		Thread.sleep(4000);
		System.out.println(act.getText());
		act.accept();
		
		Thread.sleep(4000);
		driver.close();
	}

}
