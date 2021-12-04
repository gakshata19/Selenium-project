package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement wb=driver.findElement(By.linkText("Gmail"));
		wb.click();
		driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		wb=driver.findElement(By.cssSelector("#identifierId"));
		wb.sendKeys("gakshata19@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("softech@123");
		Thread.sleep(3000);
		driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	
	}

}
