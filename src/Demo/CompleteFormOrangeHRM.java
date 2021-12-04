package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CompleteFormOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\akshatag\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		//Login
		WebElement w1=driver.findElement(By.id("txtUsername"));
		w1.sendKeys("Admin");
		System.out.println("Username: "+w1.getAttribute("value"));
		
		WebElement w2=driver.findElement(By.id("txtPassword"));
		w2.sendKeys("admin123");
		System.out.println("Password: "+w2.getAttribute("value"));
		System.out.println('\n'+"Login Successful!!!");
		Thread.sleep(5000);
		
		//PIM tab
		System.out.println('\n'+"PIM Data");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Akshata");
		driver.findElement(By.id("lastName")).sendKeys("Gaikwad");
		System.out.println("Employee Generated is: "+driver.findElement(By.id("employeeId")).getAttribute("value"));
		Thread.sleep(10000);
		driver.findElement(By.id("btnSave")).click();
		
		//Details form
		System.out.println('\n'+"Employee Details:");		
		WebElement w3=driver.findElement(By.id("btnSave"));
			w3.click();
			System.out.println("First Name: "+driver.findElement(By.id("personal_txtEmpFirstName")).getAttribute("value"));
			System.out.println("Last Name: "+driver.findElement(By.id("personal_txtEmpLastName")).getAttribute("value"));
			WebElement w4=driver.findElement(By.id("personal_optGender_2"));
			w4.click();
			System.out.println("Gender: "+driver.findElement(By.xpath("//*[@id=\"frmEmpPersonalDetails\"]/fieldset/ol[3]/li[1]/ul/li[2]/label")).getText());
			
			WebElement w5=driver.findElement(By.id("personal_cmbMarital"));
			Select s1=new Select(w5);
			s1.selectByVisibleText("Single");
			WebElement w6=s1.getFirstSelectedOption();
			System.out.println("Marital Status: "+w6.getText());
			
			WebElement w7=driver.findElement(By.id("personal_cmbNation"));
			Select s2=new Select(w7);
			s2.selectByVisibleText("Indian");
			WebElement w8=s2.getFirstSelectedOption();
			System.out.println("Nationality: "+w8.getText());		
			w3.click();
	
			System.out.println("Employee Details saved successfully!!!"+'\n');	
			
			//Blood group
			WebElement w9=driver.findElement(By.id("btnEditCustom"));
			w9.click();
			WebElement w10=driver.findElement(By.name("custom1"));
			Select s3=new Select(w10);
			s3.selectByValue("O+");
			WebElement w11=s3.getFirstSelectedOption();
			System.out.println("Blood Group: "+w11.getText());	
			w9.click();
			System.out.println("Blood group saved successfully!!!");
		Thread.sleep(5000);
		driver.close();
	}

}
