package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.navigate().to("https://en-gb.facebook.com/reg");
		WebElement wb=driver.findElement(By.id("u_0_j_NU"));
		boolean c=wb.isDisplayed();
		System.out.println(c);
		boolean b=wb.isEnabled();
		System.out.println(b);
//		wb.sendKeys("Akshata");
//		String a=wb.getAttribute("value");
//		System.out.println(a);
//		
//		wb=driver.findElement(By.id("u_0_l_Lw"));
//		wb.sendKeys("Gaikwad");
//		String d=wb.getAttribute("value");
//		System.out.println(d);
		
		wb=driver.findElement(By.xpath("//*[@id=\"u_0_w_ld\"]/span[1]/label"));
			boolean g=wb.isDisplayed();
			System.out.println(g);
			boolean h=wb.isEnabled();
			System.out.println(h);
			boolean i=wb.isSelected();
			System.out.println(i);
			wb.click();
			boolean j=wb.isSelected();
			System.out.println(j);
			
			wb=driver.findElement(By.xpath("//*[@id=\"u_0_w_ld\"]/span[2]/label"));
			wb.click();
			boolean e=wb.isSelected();
			System.out.println(e);
			
			 wb=driver.findElement(By.xpath("//*[@id=\"u_0_w_ld\"]/span[1]/label"));
			 boolean f=wb.isSelected();
			System.out.println(f);
			

	}

}
