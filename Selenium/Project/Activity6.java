package projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Activity6 {
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
	public void testApplyForJob() {

		driver.get("https://alchemy.hguy.co/jobs/");
		// Navigate to Jobs page
		driver.findElement(By.linkText("Jobs")).click();

		// Enter keyword and search
		driver.findElement(By.id("search_keywords")).sendKeys("Banking");
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();

		// Wait for job listings to be visible (retry for up to 15s)
		List<WebElement> jobs = wait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='job_listings']//li")));

		// Fail if no jobs found
		if (jobs.isEmpty()) {
			Assert.fail("No jobs found for keyword 'Banking'");
		}

		// Click the first job (wait until clickable)
		WebElement firstJob = wait.until(ExpectedConditions.elementToBeClickable(jobs.get(0)));
		firstJob.click();

		// Wait for Apply button to be clickable and click it
		WebElement applyBtn = wait
				.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".application_button")));
		applyBtn.click();

		// Verify that the application email is displayed
		WebElement email = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='application_details']//a")));
		Assert.assertTrue(email.isDisplayed(), "Application email is not displayed");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
