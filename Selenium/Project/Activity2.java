package projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import project.BaseTest;

public class Activity2 extends BaseTest {
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
    public void testWebsiteHeading() {
		driver.get("https://alchemy.hguy.co/jobs/");
        String heading = wait.until(driver ->
                driver.findElement(By.xpath("//h1[contains(@class,'entry-title')]"))
        ).getText();
        Assert.assertEquals(heading, "Welcome to Alchemy Jobs");
    }
    @AfterClass
	public void tearDown() {
		driver.quit();
	}
}
