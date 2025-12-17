package examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity_12 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/dynamic-content");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println("Page title : " + driver.getTitle());

		driver.findElement(By.xpath("//button[@id='genButton']")).click();

		WebElement genTextEle = driver.findElement(By.xpath("//h2[@id='word']"));
		if (w.until(ExpectedConditions.textToBePresentInElement(genTextEle, "release"))) {
			System.out.println("Current word is : " + genTextEle.getText());
		}
		driver.quit();
	}

}
