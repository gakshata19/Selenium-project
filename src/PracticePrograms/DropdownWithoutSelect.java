package PracticePrograms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("country")).click();
		List<WebElement> ls=driver.findElements(By.xpath("//select[@name='country']/option"));
		
		for(WebElement w:ls) {
			String a=w.getText();
			if(a.contains("ANGOLA")) {
				w.click();
				break;
			}
		}
		System.out.println("Elements in drop down are: "+ls.size());
		
		driver.findElement(By.id("email")).sendKeys("abc");
}

}
