package CompleteScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompleteScriptSelenium {

	public static WebDriver driver; 
	static int i=1;
	public static void Screenshot() throws IOException {
		i++;
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File dist= new File("C:\\Users\\akshatag\\Desktop\\Automation\\Selenium Notes\\Screenshots\\SC" +i+ ".png");
		FileUtils.copyFile(f, dist);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		//Text fields
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fname.sendKeys("Vinod");
		System.out.println("First Name: "+fname.getAttribute("value"));
		WebElement lname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lname.sendKeys("Khandare");
		System.out.println("Last Name: "+lname.getAttribute("value"));
		
		//Radio Button
		WebElement gender=driver.findElement(By.name("radiooptions"));
		gender.click();
		System.out.println("Gender is: "+gender.getAttribute("value"));
		
		//Check Box
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		System.out.println("Hobbies selected are: ");
		System.out.println(driver.findElement(By.xpath("//label[text()=' Cricket ']")).getText());
		System.out.println(driver.findElement(By.xpath("//label[text()='Movies ']")).getText());
		
		//Language select multiple options
		driver.findElement(By.id("msdd")).click();
		WebElement hindi=driver.findElement(By.xpath("//a[@class='ui-corner-all'][text()='Hindi']"));
		hindi.click();
		WebElement eng=driver.findElement(By.xpath("//a[@class='ui-corner-all'][text()='English']"));
		eng.click();
		WebElement french=driver.findElement(By.xpath("//a[@class='ui-corner-all'][text()='French']"));
		french.click();
		
		//Drop Down
		WebElement year=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select syear=new Select(year);
		syear.selectByVisibleText("1994");
		WebElement wyear=syear.getFirstSelectedOption();
		System.out.println("Year: "+wyear.getText());
		 
		WebElement month=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select smonth=new Select(month);
		smonth.selectByVisibleText("August");
		WebElement wmonth=smonth.getFirstSelectedOption();
		System.out.println("Month: "+wmonth.getText());
		List<WebElement> lmonth=smonth.getOptions();
		System.out.println("Total months: "+lmonth.size());
		for(WebElement wb:lmonth) {
			System.out.println(wb.getText());
		}
		
		WebElement day=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select sday=new Select(day);
		sday.selectByVisibleText("15");
		Thread.sleep(5000);
		Screenshot();
		
		//Handle alert pop-up
		driver.findElement(By.xpath("//a[@class='dropdown-toggle'][text()='SwitchTo']")).click();
		driver.findElement(By.xpath("//a[text()='Alerts']")).click();
		driver.findElement(By.xpath("//a[@class='analystic'][text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert act=driver.switchTo().alert();	
		System.out.println(act.getText());
		act.sendKeys("Vinod Khandare");
		Thread.sleep(3000);
		act.accept();
		Screenshot();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("demo1")).getText());
		
		//Handle windows
		driver.navigate().to("file:///C:/Users/akshatag/Downloads/multipleBrowser1.html");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Visit Orange HRM")).click();
		driver.findElement(By.linkText("Visit Facebook")).click();
		driver.findElement(By.linkText("Visit to Demo Form")).click();
		Thread.sleep(3000);
		Set<String> wset=driver.getWindowHandles();
		ArrayList<String> awindow= new ArrayList<String>(wset);
		
		driver.switchTo().window(awindow.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(awindow.get(2));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(awindow.get(3));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		Screenshot();
		driver.close();
		driver.switchTo().window(awindow.get(2));
		Screenshot();
		driver.close();
		driver.switchTo().window(awindow.get(1));
		Screenshot();
		driver.close();
		driver.switchTo().window(awindow.get(0));
		Screenshot();
		Thread.sleep(3000);
		
		//Handle Frames
		driver.navigate().to("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("classFrame");
		WebElement f1=driver.findElement(By.linkText("org.openqa.selenium.devtools.idealized"));
		System.out.println(f1.getText());
		f1.click();
		Screenshot();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		WebElement f2=driver.findElement(By.linkText("AbstractFindByBuilder"));
		System.out.println(f2.getText());
		f2.click();
		Screenshot();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		WebElement frame=driver.findElement(By.name("packageListFrame"));
		driver.switchTo().frame(frame);
		WebElement f3=driver.findElement(By.linkText("org.openqa.selenium.devtools.idealized.log.model"));
		System.out.println(f3.getText());
		f3.click();
		Screenshot();
		Thread.sleep(3000);
		
		//Handle Tables
		driver.navigate().to("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
		Screenshot();
		WebElement table=driver.findElement(By.id("task-table"));
		List<WebElement> trow=table.findElements(By.tagName("tr"));
		System.out.println(trow.size());
		for(WebElement w:trow) {
			System.out.println(w.getText());
		}
		
		List<WebElement> thead=table.findElements(By.tagName("th"));
		System.out.println(thead.size());
		for(WebElement w1:thead) {
			System.out.println(w1.getText());
		}
		
		List<WebElement> tdata=table.findElements(By.tagName("td"));
		System.out.println(tdata.size());
		for(WebElement w2:tdata) {
			System.out.println(w2.getText()+" ");
		}
		
		//Resize browser window
		Dimension d=new Dimension(1500,1000);
		driver.manage().window().setSize(d);
		driver.get("https://www.google.com");
		
		//launch headless browser
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		driver=new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		Screenshot();
		
		//explicit wait
		WebDriverWait wait= new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
		Thread.sleep(4000);
		driver.close();
	}

}
