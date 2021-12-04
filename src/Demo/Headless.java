package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {
 
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
}
}
