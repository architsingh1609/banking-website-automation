package bankingwebsite;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pract {
	@Test
	public void pract() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
		 driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
	        System.out.println("Bank Manager Login Clicked");

	        // Step 2: Click Add Customer
	        driver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click();
	        System.out.println("Add Customer Page Opened");
	        
	        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("archit");
	        
	        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Singh");
	        
	        driver.findElement(By.cssSelector("input[placeholder='Post Code']")).sendKeys("123456");
	        
	        driver.findElement(By.cssSelector("button[type='submit']")).click();
	        
	        Alert alert = driver.switchTo().alert();
	        System.out.println(alert.getText());
	        alert.accept();
	        

	}

}
