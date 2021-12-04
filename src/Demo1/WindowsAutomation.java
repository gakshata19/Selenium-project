package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows ')]")).click();
		System.out.println("Text in window is: "+driver.findElement(By.id("Tabbed")).getText());
		//driver.findElement(By.id("Tabbed")).click();
		//driver.findElement(By.xpath("//a[@target='_blank']/following::button[1]")).click();
		driver.findElement(By.xpath("//a[@target='_blank']/button")).click();
			
		System.out.println("Launched URL is: "+driver.getCurrentUrl());
		System.out.println("Title: "+driver.getTitle());
		driver.quit();
		driver.get("http://demo.automationtesting.in/Windows.html");

		System.out.println("Title: "+driver.getTitle());
		
		//driver.close();
		
		
		
		
	}

}
