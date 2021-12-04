package Demo1;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
			public static void ss(String a) throws InterruptedException, IOException{
				
				DateFormat date_format_obj = new SimpleDateFormat("dd-MM-yy_HH-mm-ss");
		        Date date_obj = new Date();
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//driver.get(a);
			String title=driver.getTitle();
			Thread.sleep(5000);		
			
			TakesScreenshot ts=(TakesScreenshot)driver;
			
			File f=ts.getScreenshotAs(OutputType.FILE);
			String d=title+date_format_obj.format(date_obj)+".jpg";
			
			System.out.println(d);
			String c="C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\Screenshots\\"+d;

			System.out.println(c);
		
			FileUtils.copyFile(f, new File(c));

			Thread.sleep(3000);		
			//driver.close();
			}

			public static void main(String[] args) throws InterruptedException, IOException {
				ss("https://www.google.com");
	
	}

}
