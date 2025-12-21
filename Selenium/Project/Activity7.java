package projects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
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

	public void testCreateJobFrontend() {

		driver.get("https://alchemy.hguy.co/jobs/");

		String email = "jobposter_" + System.currentTimeMillis() + "@mail.com";
		String jobTitle = "SDET " + System.currentTimeMillis();

		driver.findElement(By.linkText("Post a Job")).click();
		driver.findElement(By.id("create_account_email")).sendKeys(email);
		driver.findElement(By.id("job_title")).sendKeys(jobTitle);
		new Select(driver.findElement(By.id("job_type"))).selectByVisibleText("Full Time");
		driver.findElement(By.id("application")).sendKeys("https://github.com/shuvam-sb");
		driver.findElement(By.name("company_name")).sendKeys("IBM");

		wait.until(driver -> driver.switchTo().frame("job_description_ifr"));
		driver.findElement(By.id("tinymce")).sendKeys("Dummy job description");
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//input[@value='Preview']")).click();
		wait.until(driver -> driver.findElement(By.id("job_preview_submit_button"))).click();

		driver.findElement(By.linkText("Jobs")).click();
		driver.findElement(By.xpath("//input[@id='search_keywords']")).clear();
		driver.findElement(By.xpath("//input[@value='Search Jobs']")).click();

		WebElement postedJob = wait.until(driver -> driver.findElement(By.xpath("//h3[text()='" + jobTitle + "']")));

		Assert.assertTrue(postedJob.isDisplayed());
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
