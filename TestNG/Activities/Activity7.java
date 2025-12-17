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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity7 {
	WebDriver driver;
	WebDriverWait w;

	@BeforeClass
	public void setup() {
		driver = new EdgeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/login-form");
	}
	@DataProvider(name="Credentials")
	public static Object [][] getCredentials(){
		return new Object[][] {
			{ "notAadmin", "00000", "Invalid Credentials" },
            { "wrongAdmin", "wrongPassword", "Invalid Credentials" }
		};
	}
	
	@Test(dataProvider = "Credentials")
	public void testLoginForm(String username, String Password,String msg){
		driver.findElement(By.xpath("//input[@id='username']")).clear();
		driver.findElement(By.xpath("//input[@id='password']")).clear();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='subheading']")));
		String checkConfirmationText = driver.findElement(By.xpath("//h2[@id='subheading']")).getText();
		System.out.println(checkConfirmationText);
		Assert.assertEquals(checkConfirmationText,msg);

	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
