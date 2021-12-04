package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertP {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/alertPopUp.html");
		WebElement wa=driver.findElement(By.xpath("/html/body/div/button"));
		wa.click();
		Alert act=driver.switchTo().alert();
		String a=act.getText();
		System.out.println("Text in alert popup is: "+a);
		act.sendKeys("Akshata");
		act.accept();
		
		if(act.getText().contains("Blank")) {
		System.out.println("Text in alert popup is: "+act.getText());
			act.accept();
		}else {
		String b=act.getText();
		System.out.println("Text in alert popup is: "+b);
		Thread.sleep(3000);
		act.accept();
		}
		driver.close();
	}

}
