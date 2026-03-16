package bankingwebsite;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class customer {

	@Test
	public void custo() {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			
			 driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
		        System.out.println("Bank Manager Login Clicked");
		        driver.findElement(By.xpath("//button[normalize-space()='Customers']")).click();
		        driver.findElement(By.xpath("//input[@placeholder='Search Customer']")).sendKeys("Harry");
		        
		
	}
}

