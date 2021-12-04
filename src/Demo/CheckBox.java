package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/akshatag/Downloads/checkBox.html");
		
		WebElement wb=driver.findElement(By.xpath("//*[@id=\"vehicle1\"]"));
		String a=driver.findElement(By.xpath("/html/body/form/label[1]")).getText();
		System.out.println("1st Checkbox is: "+a);
		boolean b=wb.isDisplayed();
		System.out.println("1st Checkbox is displayed? "+b);
		boolean c=wb.isEnabled();
		System.out.println("1st Checkbox is enabled? "+c);
		boolean d= wb.isSelected();
		System.out.println("1st Checkbox is selected? "+d);
		Thread.sleep(3000);
		wb.click();
		Thread.sleep(1000);
		boolean e= wb.isSelected();
		System.out.println("1st Checkbox is selected after click? "+e);
		System.out.println();
		
		Thread.sleep(1000);
		WebElement wa=driver.findElement(By.xpath("//*[@id=\"vehicle2\"]"));
		String a1=driver.findElement(By.xpath("/html/body/form/label[2]")).getText();
		System.out.println("2nd Checkbox is: "+a1);
		boolean b1=wa.isDisplayed();
		System.out.println("2nd Checkbox is displayed? "+b1);
		boolean c1=wa.isEnabled();
		System.out.println("2nd Checkbox is enabled? "+c1);
		boolean d1= wa.isSelected();
		System.out.println("2nd Checkbox is selected? "+d1);
		wa.click();
		boolean e1= wa.isSelected();
		System.out.println("2nd Checkbox is selected after click? "+e1);
		System.out.println();
		
		WebElement wc=driver.findElement(By.xpath("/html/body/form/input[3]"));
		String a2=driver.findElement(By.xpath("/html/body/form/label[3]")).getText();
		System.out.println("3rd Checkbox is: "+a2);
		Thread.sleep(1000);
		wc.click();
		boolean b2= wc.isSelected();
		System.out.println("1st Checkbox is selected after click? "+b2);
		
		String button=driver.findElement(By.xpath("/html/body/form/input[4]")).getAttribute("value");
		System.out.println("Value of button: "+button);
		if(wb.isSelected()==true || wa.isSelected()==true || wc.isSelected()==true ) {
			driver.findElement(By.xpath("/html/body/form/input[4]")).click();
			System.out.println("Submit Successful !!!");
		}else
			System.out.println("Select atleast 1 check box");		
		Thread.sleep(3000);
		driver.close();
	}

}
