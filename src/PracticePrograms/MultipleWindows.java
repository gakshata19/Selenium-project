package PracticePrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	static String handle1, handle2;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/multipleBrowser1.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Visit Orange HRM']")).click();
//		driver.findElement(By.xpath("//a[text()='Visit Facebook']")).click();
//		driver.findElement(By.xpath("//a[text()='Visit to Google']")).click();
//		driver.findElement(By.xpath("//a[text()='Visit to FB create account']")).click();
		driver.findElement(By.xpath("//a[text()='Visit to Demo Form']")).click();
		
		Thread.sleep(3000);
		Set<String> handles=driver.getWindowHandles();
		for(String s:handles) {
			
		if(s!=parent && s!=handle1) {
				handle1=s;
				System.out.println("handle1: "+handle1);				
//				driver.switchTo().window(s);
//				if(driver.getTitle()=="OrangeHRM") {
//					driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//				}
//				
//				else if(driver.getTitle()=="ToolsQA") {
//					driver.findElement(By.id("firstName")).sendKeys("Akshata");
//				}
		}
			
			else if(s!=parent && s!=handle1) {
				handle2=s;
				System.out.println("handle2: "+handle2);
			}
//			else if(driver.getTitle()=="ToolsQA") {
//				System.out.println(driver.findElement(By.className("lnXdpd")).getText());
//			}
			
//			else
//				System.out.println("Window not handled");
		}
		System.out.println('\n'+handle1);
		driver.switchTo().window(handle1);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		System.out.println('\n'+handle2);
//		driver.switchTo().window(handle2);	
//		driver.findElement(By.id("firstName")).sendKeys("Akshata");
		
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Vinod");
	}

}
