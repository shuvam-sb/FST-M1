package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form/");
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("admin");
		WebElement userPassword = driver.findElement(By.id("password"));
		userPassword.sendKeys("passwords");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		driver.quit();


	}

}
