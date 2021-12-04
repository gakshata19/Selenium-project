package Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthReverse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement w=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s=new Select(w);
		List<WebElement> we=s.getOptions();
		ArrayList a=new ArrayList();
		System.out.println("Months are: ");
		for(WebElement wb:we) {
			String s1=wb.getText();
			a.add(s1);
			System.out.println(s1);
		}
		
		Collections.reverse(a);
		for(int i=0;i<=5;i++) {
		System.out.print(a.get(i) +" ");
		}
		System.out.println();
		for(int i=6;i<a.size();i++) {
			System.out.print(a.get(i) +" ");
		}
		System.out.println();
		Collections.sort(a);
		System.out.println(a);
		
		Collections.reverse(a);
		System.out.println(a);
		driver.close();
		
	}

}
