package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		WebElement w=driver.findElement(By.name("classFrame"));
		driver.switchTo().frame(w);
		WebElement wa=driver.findElement(By.linkText("org.openqa.selenium.devtools.idealized.target"));
		String a=wa.getText();
		System.out.println(a);
		wa.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("packageFrame");
		WebElement wb=driver.findElement(By.linkText("AbstractAnnotations"));
		String b=wb.getText();
		System.out.println(b);
		wb.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		WebElement wc=driver.findElement(By.linkText("org.openqa.selenium.devtools"));
		String c=wc.getText();
		System.out.println(c);
		wc.click();
		Thread.sleep(3000);
		driver.close();
	}
}
