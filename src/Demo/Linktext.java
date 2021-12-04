package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) {
		
	//It connects to actual web browser
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		//up casting
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gm")).click();
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		
	}

}
