package PracticePrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

public class ElementBGColor {

	public static void flash(WebDriver driver, WebElement wb, String color) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].style.backgroundColor= ' "+color+" ' ",wb);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement wb=driver.findElement(By.name("login"));
		String a=wb.getCssValue("background-color");
		System.out.println("Background color is: "+a);
		for(int i=0; i<200; i++) {
			flash(driver, wb, "rgb(100,218,185)");
			Thread.sleep(20);
			flash(driver, wb, a);
		}
		
		Thread.sleep(7000);
		driver.close();
	}

}
