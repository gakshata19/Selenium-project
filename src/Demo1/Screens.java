package Demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screens {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		//File d=new File("C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\Screenshots\\a.png");
		FileUtils.copyFile(f, new File("C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\Screenshots\\b.png"));
		Thread.sleep(3000);
		driver.close();
	}

}
