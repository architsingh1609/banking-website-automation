package bankingwebsite;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class openaccount {
	@Test
	public void openacct() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		
		 driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
	        System.out.println("Bank Manager Login Clicked");
	       	        driver.findElement(By.xpath("(//button[normalize-space()='Open Account'])[1]")).click();
	        // //button[normalize-space()='Add Customer']
	       	       new Select (driver.findElement(By.xpath("//select[@id='userSelect']"))).selectByVisibleText("Albus Dumbledore");
	       	       new Select (driver.findElement(By.xpath("//select[@id='currency']"))).selectByVisibleText("Rupee");
	       	       driver.findElement(By.xpath("//button[@type='submit']")).click();
	       	       Alert alert = driver.switchTo().alert();
	       	       System.out.println(alert.getText());
	       	       alert.accept();

	       	        
	}

}
