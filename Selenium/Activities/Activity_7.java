package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		System.out.println("Page title : " + driver.getTitle());
		
		System.out.println("Input text field is enabled true/false : "+driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());
		
		//Enable input text field
		driver.findElement(By.xpath("//button[@id='textInputButton']")).click();
		System.out.println("After clicking on Enable Input Button");

		
		System.out.println("Input text field is enabled true/false : "+driver.findElement(By.xpath("//input[@id='textInput']")).isEnabled());
		
		driver.quit();
		

	}

}
