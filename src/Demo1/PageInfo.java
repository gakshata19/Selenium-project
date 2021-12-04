package Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PageInfo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement wa=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input"));
		wa.sendKeys("Akshata");
		System.out.println("First Name: "+wa.getAttribute("value"));
		
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
		wb.sendKeys("Gaikwad");
		System.out.println("Last Name: "+wb.getAttribute("value"));
		
		WebElement wc=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
		wc.sendKeys("Pune");
		System.out.println("Address: "+wc.getAttribute("value"));
		
		WebElement wd=driver.findElement(By.xpath("//*[@id=\"eid\"]/input"));
		wd.sendKeys("abc@gmail.com");
		System.out.println("Email "+wd.getAttribute("value"));
		
		WebElement we=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
		we.sendKeys("9503760425");
		System.out.println("Phone no: "+we.getAttribute("value"));
		
		WebElement w=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		System.out.println("Radio button is displayed: "+w.isDisplayed());
		System.out.println("Radio button is enabled: "+w.isEnabled());
		System.out.println("Radio button is selected: "+w.isSelected());
		w.click();
		System.out.println("Radio button text is: "+driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")).getAttribute("value"));
		System.out.println("Radio button is selected: "+w.isSelected());
		
		WebElement w1=driver.findElement(By.xpath("//*[@id=\"checkbox1\"]	"));
		w1.click();
		
		WebElement w2=driver.findElement(By.xpath("//*[@id=\"checkbox2\"]"));
		w2.click();
	
		WebElement w13=driver.findElement(By.xpath("//div[@id='msdd']"));
		w13.click();
			
		WebElement w14=driver.findElement(By.xpath("//div[@id='msdd']/following::a[@class='ui-corner-all']"));
		w14.click();
		WebElement w15=driver.findElement(By.xpath("//a[@class='ui-corner-all'][text()='English']"));
		w15.click();
		WebElement w16=driver.findElement(By.xpath("//a[@class='ui-corner-all'][text()='Hindi']"));
		w16.click();
		System.out.println("Selected Languages are: "+w13.getText());
		
		WebElement w3=driver.findElement(By.xpath("//*[@id=\"Skills\"]"));
		Select s=new Select(w3);
		s.selectByVisibleText("Java");
		WebElement w4=s.getFirstSelectedOption();
		String a=w4.getText();
		System.out.println("Selected Skills is: "+a);
		List<WebElement> ls=s.getOptions();
		System.out.println("Total Skills in drop down is: "+ls.size());
		
		WebElement w5=driver.findElement(By.xpath("//*[@id=\"countries\"]"));
		Select s1=new Select(w5);
		s1.selectByVisibleText("India");
		WebElement w6=s1.getFirstSelectedOption();
		String b=w6.getText();
		System.out.println("Selected Country is: "+b);
		List<WebElement> ls1=s1.getOptions();
		System.out.println("Total Countries in drop down is: "+ls1.size());
		
		WebElement w7=driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
		Select s2=new Select(w7);
		s2.selectByVisibleText("1994");
		WebElement w8=s2.getFirstSelectedOption();
		String c=w8.getText();
		System.out.println("Selected year is: "+c);
		List<WebElement> ls2=s2.getOptions();
		System.out.println("Total year in drop down is: "+ls2.size());
		
		WebElement w9=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
		Select s3=new Select(w9);
		s3.selectByVisibleText("August");
		
		WebElement w10=driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
		Select s4=new Select(w10);
		s4.selectByVisibleText("15");
		
		WebElement w11=driver.findElement(By.xpath("//*[@id=\"firstpassword\"]"));
		w11.sendKeys("abc@123");
		System.out.println("Password: "+w11.getAttribute("value"));
		
		WebElement w12=driver.findElement(By.xpath("//*[@id=\"secondpassword\"]"));
		w12.sendKeys("abc@123");
		System.out.println("Confirm Password: "+w12.getAttribute("value"));
		
		Thread.sleep(5000);
		driver.close();	
	}

}
