package PracticePrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsInWebPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		List<WebElement> ls=driver.findElements(By.xpath("//*"));
		System.out.println(ls.size());
		for(int i=ls.size()-1; i>0; i--) {
			String s=ls.get(i).getText();
			System.out.println("Last Element is: "+s);
		}
	}

}
