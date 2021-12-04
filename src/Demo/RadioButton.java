package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/radio.html");
		
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"female\"]"));
		boolean a=wb.isDisplayed();
		System.out.println("Female radio button is displayed? "+a);
		boolean b=wb.isEnabled();
		System.out.println("Female radio button is enabled? "+b);
		boolean c=wb.isSelected();
		System.out.println("Female radio button is selected? "+c);
		Thread.sleep(4000);
		wb.click();
		boolean d=wb.isSelected();
		System.out.println("Female radio button is selected? "+d);
	
		WebElement wa=driver.findElement(By.xpath("//*[@id=\"male\"]"));
		boolean a1=wa.isDisplayed();
		System.out.println("Male radio button is displayed? "+a1);
		boolean b1=wa.isEnabled();
		System.out.println("Male radio button is enabled? "+b1);
		boolean c1=wa.isSelected();
		System.out.println("Male radio button is selected? "+c1);
		Thread.sleep(4000);
		wa.click();
		boolean d1=wa.isSelected();
		System.out.println("Male radio button is selected? "+d1);
		
		Thread.sleep(4000);
		WebElement wc=driver.findElement(By.xpath("//*[@id=\"female\"]"));
		boolean e=wc.isSelected();
		System.out.println("Female radio button is selected? "+e);
		
		Thread.sleep(4000);
		driver.close();
		
	}

}

