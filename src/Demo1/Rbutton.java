package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rbutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg");
		//driver.findElement(By.xpath("//input[@value=1]")).click();
		
		driver.findElement(By.xpath("//input[starts-with(@id,'u_0_') and @value=1]")).click();
		
		System.out.println("Gender selected is: "+driver.findElement(By.xpath("//label[text()='Female']")).getText());
		driver.close();
	}

}
