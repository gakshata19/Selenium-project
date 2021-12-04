package PracticePrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/multipleBrowser1.html");
		System.out.println(driver.getCurrentUrl());
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//a[text()='Visit Orange HRM']")).click();
		Set<String> handle=driver.getWindowHandles();
		for(String s:handle) {
			System.out.println(s);
			if(!(s.contains(parent))) {
				driver.switchTo().window(s);
				System.out.println(driver.getTitle());
			}
		}
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}
