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

public class Activity9 {
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
	public void testCreateJobBackend() {

		driver.get("https://alchemy.hguy.co/jobs/wp-admin");

		WebElement user = wait.until(driver -> driver.findElement(By.id("user_login")));
		user.sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();

		Assert.assertTrue(driver.getTitle().contains("Dashboard"));

		wait.until(driver -> driver.findElement(By.linkText("Job Listings"))).click();
		driver.findElement(By.linkText("Add New")).click();

		wait.until(driver -> driver.findElement(By.xpath("//button[@aria-label='Close dialog']"))).click();
		driver.findElement(By.id("post-title-0")).sendKeys("Backend SDE");
		driver.findElement(By.id("_company_name")).sendKeys("IBM");

		By publishBtn = By.xpath("(//button[contains(@class,'post-publish-button')])[1]");
		wait.until(driver -> driver.findElement(publishBtn)).click();

		wait.until(driver -> driver.findElement(By.xpath("(//button[contains(@class,'post-publish-button')])[2]")))
				.click();
		WebElement popup = wait.until(driver -> driver.findElement(By.className("components-snackbar__content")));

		Assert.assertTrue(popup.getText().toLowerCase().contains("published"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
