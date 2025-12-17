package examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity_15 {

	public static void main(String[] args){
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println("Page title : " + driver.getTitle());
		String fullName = "Shuvam Basak";
		String emailAddress = "shuvambasak110@gmail.com";
		String currDate = "17-12-2025";
		String additionalDetails = "This is for testing ";
		driver.findElement(By.xpath("//input[starts-with(@id,'full-name')]")).sendKeys(fullName);
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys(currDate);
		driver.findElement(By.xpath("//textarea[contains(@id, 'additional-details')]")).sendKeys(additionalDetails);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		//wait & print Success message 
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//H3[@ID='action-confirmation']")));
		System.out.println(driver.findElement(By.xpath("//H3[@ID='action-confirmation']")).getText());
		
		//Close browser
		driver.quit();
		
		
	}

}
