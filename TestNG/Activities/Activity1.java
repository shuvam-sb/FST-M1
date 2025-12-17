package activities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver;
	WebDriverWait w;

	@BeforeClass
	public void setup() {
		driver = new EdgeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/");
	}

	@Test(priority = 1)
	public void homePageTest() {
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page is : " + pageTitle);
		Assert.assertEquals(pageTitle, "Training Support");

	}

	@Test(priority = 2)
	public void aboutUsPageTest() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.titleIs("About Training Support"));
		System.out.println("Title of the new page is : " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "About Training Support");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
