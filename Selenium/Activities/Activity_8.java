package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity_8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/mouse-events");
		System.out.println("Page title : " + driver.getTitle());

		Actions a = new Actions(driver);
		driver.findElement(By.xpath("//h1[text()='Cargo.lock']")).click();
		a.moveToElement(driver.findElement(By.xpath("//h1[text()='Cargo.toml']"))).pause(2000).click().build()
				.perform();
		String confirmationText = driver.findElement(By.id("result")).getText();
		System.out.println(confirmationText);

		// Double click on source button and then click on right click on target button.
		a.doubleClick(driver.findElement(By.xpath("//h1[text()='src']"))).pause(3000)
				.contextClick(driver.findElement(By.xpath("//h1[text()='target']"))).pause(2000).build().perform();
		//Clicking on open button
		driver.findElement(By.xpath("//div[@id='menu']//li[1]")).click();
		Thread.sleep(2000);
		confirmationText = driver.findElement(By.id("result")).getText();
		System.out.println(confirmationText);

		
		driver.quit();

	}

}
