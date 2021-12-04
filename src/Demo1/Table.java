package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/table.html");
		WebElement table=driver.findElement(By.id("table"));
		List<WebElement> ls=table.findElements(By.tagName("tr"));
		int rowcount=ls.size();
		System.out.println(rowcount);
		
		List<WebElement> lh=table.findElements(By.tagName("th"));
		int headcount=lh.size();
		System.out.println(headcount);
		
		List<WebElement> ld=table.findElements(By.tagName("td"));
		int datacount=ld.size();
		System.out.println(datacount);
		for(WebElement wb:ld) {		
			String s=wb.getText();
			if(s.contains("May"))
			{
				System.out.println("May is present");
			}	
		}
		driver.close();
}
}

