package Demo1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/multipleBrowser1.html");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Visit Orange HRM")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Visit Facebook")).click();
		driver.findElement(By.linkText("Visit to Google")).click();
		driver.findElement(By.linkText("Visit to FB create account")).click();
		driver.findElement(By.linkText("Visit to Demo Form")).click();
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Set<String> s=driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(s);
		
		driver.switchTo().window(a.get(5));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.switchTo().window(a.get(4));
		driver.findElement(By.id("email")).sendKeys("Akshata");
		
		Thread.sleep(3000);
		driver.switchTo().window(a.get(3));
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Selenium");
		
		driver.switchTo().window(a.get(2));
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-' and @name='firstname']")).sendKeys("Akshata");
		
		driver.switchTo().window(a.get(1));
		driver.findElement(By.id("firstName")).sendKeys("AKSH");
	}

}
