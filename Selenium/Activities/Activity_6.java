package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title : " + driver.getTitle());

		System.out.println("Check whether input checkbox is selected (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='checkbox']")).click();
		System.out.println("After clicking on check box Button");

		
		//Check again whether the check box is displayed
		System.out.println("Check whether input checkbox is selected (True/False) : "
				+ driver.findElement(By.xpath("//input[@id='checkbox']")).isSelected());
		
		
		driver.quit();
	}

}
