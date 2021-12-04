package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkb {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/checkBox.html");
		WebElement wa=driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		String a=driver.findElement(By.xpath("/html/body/form/label[1]")).getText();
		System.out.println("Text of checkbox is: "+a);
		boolean b=wa.isDisplayed();
		System.out.println("1st checkbox is displayed? "+b);
		boolean c=wa.isEnabled();
		System.out.println("1st checkbox is enabled? "+c);
		boolean d=wa.isSelected();
		System.out.println("1st checkbox is selected? "+d);
		wa.click();
		boolean e=wa.isSelected();
		System.out.println("1st checkbox is selected? "+e+'\n');
		Thread.sleep(3000);
		
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"vehicle2\"]"));
		String a1=driver.findElement(By.xpath("/html/body/form/label[2]")).getText();
		System.out.println("Text of checkbox is: "+a1);
		boolean b1=wb.isDisplayed();
		System.out.println("2nd checkbox is displayed? "+b1);
		boolean c1=wb.isEnabled();
		System.out.println("2nd checkbox is enabled? "+c1);
		boolean d1=wb.isSelected();
		System.out.println("2nd checkbox is selected? "+d1);
		wb.click();
		boolean e1=wb.isSelected();
		System.out.println("2nd checkbox is selected? "+e1+'\n');
		
		Thread.sleep(3000);
		WebElement wc=driver.findElement(By.xpath("/html/body/form/input[3]"));
		String a2=driver.findElement(By.xpath("/html/body/form/label[3]")).getText();
		System.out.println("Text of checkbox is: "+a2);
		boolean b2=wc.isDisplayed();
		System.out.println("3rd checkbox is displayed? "+b2);
		boolean c2=wc.isEnabled();
		System.out.println("3rd checkbox is enabled? "+c2);
		boolean d2=wc.isSelected();
		System.out.println("3rd checkbox is selected? "+d2);
		wc.click();
		boolean e2=wc.isSelected();
		System.out.println("3rd checkbox is selected? "+e2+'\n');
		
		WebElement wd=driver.findElement(By.xpath("/html/body/form/input[4]"));
		wd.click();
		System.out.println("Submitted Successfully!!");
		driver.close();
	}

}
