package activities;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver;
	WebDriverWait w;

	@BeforeClass(alwaysRun = true)
	public void setup() {
		driver = new EdgeDriver();
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test
	public void testPageTitle() {
		Assert.assertEquals(driver.getTitle(),"Selenium: Target Practice");
	}
	@Test(groups = "HeaderTests")
	public void testHeader1() {
		WebElement h3Ele = driver.findElement(By.xpath("//h3[contains(@class,'orange')]"));
		Assert.assertEquals(h3Ele.getText(),"Heading #3");
	}
	@Test(groups = "HeaderTests")
	public void testHeader2() {
		Color h5Ele = Color.fromString( driver.findElement(By.xpath("//h5[contains(@class,'purple')]")).getCssValue("color"));
		Assert.assertEquals(h5Ele.asHex(),"#9333ea");
	}
	@Test(groups = "ButtonTests")
	public void buttonTest1() {
		WebElement emeraldButton = driver.findElement(By.xpath("//button[contains(@class,'emerald')]"));
		Assert.assertEquals(emeraldButton.getText(),"Emerald");
	}
	@Test(groups = "ButtonTests")
	public void buttonTest2() {
		Color purpleBtn = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'text-purple')]")).getCssValue("color"));
        //System.out.println(purpleBtn.asHex());
		Assert.assertEquals(purpleBtn.asHex(), "#581c87");
	}
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}


}
