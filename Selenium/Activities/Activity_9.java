package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_9 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/keyboard-events");
		System.out.println("Page title : " + driver.getTitle());
		Actions a = new Actions(driver);
		a.sendKeys("Testing keyboard strokes").build().perform();
		String extractText = driver.findElement(By.xpath("//h1[contains(@class,'mt-3')]")).getText();
		System.out.println("Given text input is : "+extractText);
		driver.quit();
	}

}
