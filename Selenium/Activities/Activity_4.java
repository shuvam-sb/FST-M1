package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		System.out.println("Page title : " + driver.getTitle());

		System.out.println("Title of third header : " + driver.findElement(By.xpath("//h3[contains(text(),'#3')]")).getText());

		String fifthHeaderColor = driver.findElement(By.xpath("//h5[contains(text(),'#5')]")).getCssValue("color");
		System.out.println("Color of fifth Header in RGB format is : " + fifthHeaderColor);
        
        System.out.println("Purple Button Class = " + driver.findElement(By.xpath("//button[text()='Purple']")).getDomAttribute("class"));
        
       
        System.out.println("Grey Button Class text is = " + driver.findElement(By.xpath("//button[contains(@class, 'slate')]")).getText());
		driver.quit();

	}

}
