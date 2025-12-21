package projects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
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
	public void testWebsiteTitle() {

		driver.get("https://alchemy.hguy.co/jobs/");
		Assert.assertEquals(driver.getTitle(), "Alchemy Jobs – Job Board Application");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
