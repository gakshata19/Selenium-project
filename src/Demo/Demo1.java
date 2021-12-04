package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Desktop\\Automation Assignments\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			
			driver.get("https://www.nvidia.com/en-us/");
		System.out.println(driver.getCurrentUrl());
		
		String a=driver.getTitle();
		if(a.contains("nvidia"))
		{
			System.out.println("Test case pass");
		}
		else
				System.out.println("Test case fail");
	}

}
