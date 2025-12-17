package activities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver;
	WebDriverWait w;

	@BeforeClass
	public void setup() {
		driver = new EdgeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/target-practice/");

	}

	@Test
	public void testCase1() {
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is : " + pageTitle);
		Assert.assertEquals(pageTitle, "Selenium: Target Practice");

	}
	@Test
	public void testCase2() {
		//Should Fail, due to wrong xpath
		Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Black']")).isDisplayed());
	}
	@Test(enabled = false)
	public void testCase3() {
		//The third method will be skipped, but will not be shown as skipped.
		Assert.assertTrue(driver.findElement(By.xpath("//h1/span[text()='Practice']")).isDisplayed());
	}
	@Test
	public void testCase4() {
		//For the fourth @Test method, skip it by throwing a SkipException inside the method.
		//The fourth method will be skipped and it will be shown as skipped.
		throw new SkipException("Skipping this test intentionally");
	}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
