package examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		System.out.println("Page title : " + driver.getTitle());

		System.out.println("Check whether input checkbox is present (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());

		// Click on toggle button to remove check box
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();

		//Wait for check box to disappear
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));
		System.out.println("Check whether input checkbox is present (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());

		// Click on toggle button to enable check box again
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		
		//Wait for check box to appear again
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='checkbox']")));

		System.out.println("Check whether input checkbox is present (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
		
		
		//Select the check box
		driver.findElement(By.xpath("//input[@id='checkbox']")).click();
		System.out.println("After clicking on check box Button");
		
		//Check again whether the check box is selected
		System.out.println("Check whether input checkbox is selected (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
		driver.quit();
	}

}
