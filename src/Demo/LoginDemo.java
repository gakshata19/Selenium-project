package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		
		WebElement wb=driver.findElement(By.id("firstName"));
		boolean c=wb.isDisplayed();
		System.out.println(c);
		boolean b=wb.isEnabled();
		System.out.println(b);
		wb.sendKeys("Akshata");
		String a=wb.getAttribute("value");
		System.out.println(a);
		
		driver.close();
	}

}
