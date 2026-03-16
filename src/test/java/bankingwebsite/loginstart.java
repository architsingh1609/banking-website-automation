package bankingwebsite;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginstart {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test
    public void addCustomerTest() {

        // Step 1: Click Bank Manager Login
        driver.findElement(By.xpath("//button[normalize-space()='Bank Manager Login']")).click();
        System.out.println("Bank Manager Login Clicked");

        // Step 2: Click Add Customer
        driver.findElement(By.xpath("//button[normalize-space()='Add Customer']")).click();
        System.out.println("Add Customer Page Opened");

        // Step 3: Enter First Name
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Archit");

        // Step 4: Enter Last Name
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Singh");

        // Step 5: Enter Post Code
        driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("123456");

        // Step 6: Click Submit
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Step 7: Handle Alert
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();

        System.out.println("Alert Message: " + alertMessage);

        alert.accept();
    }

    @AfterMethod
    public void tearDown() {

      driver.quit();
    }
}
