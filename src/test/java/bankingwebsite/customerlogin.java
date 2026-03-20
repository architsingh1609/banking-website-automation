package bankingwebsite;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class customerlogin {
	@Test
	public void custo() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
			driver.findElement(By.xpath("//button[normalize-space()='Customer Login']")).click();
			new Select (driver.findElement(By.xpath("//select[@id='userSelect']"))).selectByVisibleText("Harry Potter");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Deposit']")).click();
			driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("100000");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			WebElement tran = driver.findElement(By.xpath("//span[@class='error ng-binding']"));
			System.out.println(tran.getText());
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Withdrawl']")).click();
			driver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("1600");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			WebElement Withdrawn = driver.findElement(By.xpath("//span[@class='error ng-binding']"));
			System.out.println(Withdrawn.getText());
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
			driver.findElement(By.xpath("//button[@class='btn logout']")).click();
			driver.quit();
			
	}
	

}
