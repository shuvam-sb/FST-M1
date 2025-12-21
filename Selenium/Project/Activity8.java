package projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity8 {
	public WebDriver driver;
	public WebDriverWait wait;
	@BeforeClass
	public void setUp() {
	 	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    	System.out.println("Browser initialized successfully.");
	}


    @Test
    public void testLoginBackend() {
    	driver.get("https://alchemy.hguy.co/jobs/wp-admin");
    	
        WebElement user = wait.until(driver -> driver.findElement(By.id("user_login")));
        user.sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();

        Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }
    @AfterClass
	public void tearDown() {
		driver.quit();
	}
}
