package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/drag-drop");
		System.out.println("Page title : " + driver.getTitle());
		WebElement ball = driver.findElement(By.xpath("//img[@id='ball']"));
	
		WebElement zone1  = driver.findElement(By.xpath("//div[@id='dropzone1']"));
		WebElement zone2  = driver.findElement(By.xpath("//div[@id='dropzone2']"));
		Actions a = new Actions(driver);
		a.doubleClick(ball).dragAndDrop(ball,zone1).pause(2000).build().perform();
		if(zone1.findElement(By.xpath(".//span")).getText().equals("Dropped!")) {
			System.out.println("Ball is dropped in Zone 1");
		}
		a.doubleClick(ball).dragAndDrop(ball,zone2).pause(2000).build().perform();
		if(zone2.findElement(By.xpath(".//span")).getText().equals("Dropped!")) {
			System.out.println("Ball is dropped in Zone 2");
		}
		
		driver.quit();
	}

}
