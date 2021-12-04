package PracticePrograms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Documents\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/table.html");
		WebElement table=driver.findElement(By.id("table"));
		List<WebElement> tablerow=table.findElements(By.tagName("th"));
		
		for(WebElement w:tablerow) {
			System.out.println(w.getText());
		}
	}

}
