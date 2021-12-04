package PracticePrograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/'");
		
		String title=js.executeScript("return document.title;").toString();
		System.out.println("Page Title is: "+title);
		String Url=js.executeScript("return document.URL;").toString();
		System.out.println("Page URL is: "+Url);
		String HTMLsource=js.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(HTMLsource);
		//System.out.println('\n'+driver.getPageSource());
		
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		WebElement wb=driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].value='admin123';", wb);
		//WebElement wc=driver.findElement(By.id("btnLogin"));
		js.executeScript("document.getElementById('btnLogin').click();");
		js.executeScript("history.go(0);");
		js.executeScript("alert('Welcome Askyata!!!');");
		Alert act=driver.switchTo().alert();
		System.out.println("Alert message is:"+act.getText());
		Thread.sleep(5000);
		act.accept();
		
		
		driver.close();
	}

}
