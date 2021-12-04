package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement wb=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(wb);
		WebElement w1=driver.findElement(By.linkText("org.openqa.selenium.chrome"));
		String a=w1.getText();
		System.out.println(a);
		w1.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		WebElement w2=driver.findElement(By.linkText("org.openqa.selenium.concurrent"));
		System.out.println(w2.getText());
		w2.click();
		Thread.sleep(3000);
		driver.close();	
	}
}
