package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title : " + driver.getTitle());

		System.out.println("Check whether input checkbox is present (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
		
		//Click on remove check box/toggle button
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		System.out.println("After clicking on check box Button");

		
		//Check again whether the check box is displayed
		System.out.println("Check whether input checkbox is present (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed());
		driver.quit();

	}

}
