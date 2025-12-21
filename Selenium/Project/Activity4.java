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

public class Activity4{
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
    public void testSubHeading() {

		driver.get("https://alchemy.hguy.co/jobs/");
        String subHeading = driver.findElement(By.xpath("//div[contains(@class,'entry-content')]//h2")).getText();
        Assert.assertEquals(subHeading, "Quia quis non");
    }
    @AfterClass
	public void tearDown() {
		driver.quit();
	}
}
