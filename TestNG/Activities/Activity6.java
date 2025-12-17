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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
	WebDriver driver;
	WebDriverWait w;

	@BeforeClass
	public void setup() {
		driver = new EdgeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
	}
	@Test 
	@Parameters({"username","password"})
	public void testLoginForm(String username, String Password){
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(@class,'text-center text-4xl')]")));
		String checkConfirmationText = driver.findElement(By.xpath("//h2[contains(@class,'text-center text-4xl')]")).getText();
		System.out.println(checkConfirmationText);
		Assert.assertEquals(checkConfirmationText,"Welcome Back, Admin!");

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
