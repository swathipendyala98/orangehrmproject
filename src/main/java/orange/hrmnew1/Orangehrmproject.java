package orange.hrmnew1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrmproject {

	
		WebDriver driver = new ChromeDriver();
		

		public void logintest1() throws InterruptedException {
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");	
		
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button [contains(@ class,'oxd-button')]")).click();
		}
		public void Addemployee() throws InterruptedException
		
		{
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='PIM']")).click();
			
			//driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.linkText("Add Employee")).click();
			
			
			
			WebElement firstname= driver.findElement(By.name("firstName"));
			
			firstname.sendKeys("anshu");
			
			WebElement lastname= driver.findElement(By.name("lastName"));
			
			lastname.sendKeys("malyala");
			
			//driver.findElement(By.xpath("//input [contains(@	class ,'oxd-input')]")).sendKeys("0553");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}
	
		
	public void CheckEmployeedetails() {
	driver.findElement(By.linkText ("Employee List")).click();
	
	driver.findElement(By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div//input")).sendKeys("anshu malyala");
	
	driver.findElement(By.xpath("//button [@type='submit']")).click();
	
		}
	
		
			
		
		public static void main(String[] args) throws InterruptedException {

		Orangehrmproject O = new Orangehrmproject();
		O.logintest1();
		O.Addemployee();
		O.CheckEmployeedetails();
}
}