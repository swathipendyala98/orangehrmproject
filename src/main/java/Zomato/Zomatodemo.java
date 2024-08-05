package Zomato;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomatodemo {
	public static void main(String[] args) throws InterruptedException
    {
   	 
		// Instantiate a ChromeDriver class.
   	  WebDriver driver = new ChromeDriver();    
         driver.manage().window().maximize();
         driver.get("https://www.zomato.com/");
         Thread.sleep(4000);
         driver.findElement(By.xpath("//a[text()='Sign up']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("swathipendyala");
         driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("swathipendyala2020@gmail.com");
         driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        driver.findElement(By.xpath("//span[text()='Create account']")).click();
         Thread.sleep(7000);
         driver.findElement(By.xpath("//span[text()='Skip for now']")).click();
         driver.findElement(By.xpath("//a[text()='Log in']")).click();
         driver.switchTo().frame("auth-login-ui");
         driver.findElement(By.xpath("//span[text()='Continue with Email']")).click();
        
         driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 jucaYn']")).sendKeys("swathipendyala2020@gmail.com");
         driver.findElement(By.xpath("//span[text()='Send One Time Password']")).click();
         Thread.sleep(30000);
         driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).sendKeys("Thickshake");
         Thread.sleep(7000);
         driver.findElement(By.xpath("//input[@placeholder='Search for restaurant, cuisine or a dish']")).click();
         driver.findElement(By.xpath("(//img[@alt='Restaurant Image'])[1]")).click();
         driver.findElement(By.xpath("//a[text()='Order Online']")).click();
         driver.findElement(By.xpath("(//img[@alt='Nutella Brownie Crumble Thick Shake'])[1]")).click();
    } 
}

