package Demo1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ScrollWebpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.amazon.in");
		Thread.sleep(3000);
		Actions act=new Actions(driver);	
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		act.keyDown(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).keyUp(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		driver.close();
	
	}

}
