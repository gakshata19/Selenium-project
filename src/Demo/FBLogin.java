package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.navigate().to("https://www.facebook.com/reg/");
		WebElement wb=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/label[1]"));
		boolean a=wb.isDisplayed();
		System.out.println("Radio button is displayed? "+a);
		boolean b=wb.isEnabled();
		System.out.println("Radio button is enabled? "+b);
		boolean c=wb.isSelected();
		System.out.println("Radio button is selected? "+c);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[1]/label[1]")).click();
		//wb.click();
		Thread.sleep(2000);
		String i=wb.getText();
		System.out.println("Radio button text is: "+i);
		boolean d=wb.isSelected();
		System.out.println("Radio button is selected? "+d);
		
		wb=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[7]/span[1]/span[2]/label[1]"));
		boolean e=wb.isDisplayed();
		System.out.println("Radio button is displayed? "+e);
		boolean f=wb.isEnabled();
		System.out.println("Radio button is enabled? "+f);
		boolean g=wb.isSelected();
		System.out.println("Radio button is selected? "+g);
		wb.click();
		boolean h=wb.isSelected();
		System.out.println("Radio button is selected? "+h);
		String j=wb.getText();
		System.out.println("Radio button text is: "+j);
		Thread.sleep(2000);
		driver.close();
	}

}
