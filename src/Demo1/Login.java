package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login  {
	

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String URL="https://www.google.com/";
		driver.get(URL);
		Thread.sleep(5000);
		driver.findElement(By.linkText("Gmail")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("identifierId"));
		//a.sendKeys("morednyaneshwar12@gmail.com");
		
		Actions act=new Actions(driver);
		act.sendKeys("akshata").build().perform();
		
	}

}
