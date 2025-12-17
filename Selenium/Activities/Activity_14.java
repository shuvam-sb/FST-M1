package examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_14 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page title : " + driver.getTitle());

		// Print no rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println("Number of rows in the table is : " + rows.size());

		// Print no columns
		List<WebElement> columns = driver.findElements(By.xpath("//table//thead/tr//th"));
		System.out.println("Number of columns in the table is : " + columns.size());
		
		//Print Book name in 5th row
		WebElement fifth_bookNameELe = driver.findElement(By.xpath("//table//tbody//tr[5]//td[2]"));
        System.out.println("5th Book name : " + fifth_bookNameELe.getText());
        
        //Click on header of the Price column to sort it in ascending order.
        driver.findElement(By.xpath("//table//thead/tr//th[5]")).click();
        
        //Find and print the Book Name in the 5th row again.
        fifth_bookNameELe = driver.findElement(By.xpath("//table//tbody//tr[5]//td[2]"));
        System.out.println("5th Book name after sorting in asc order based on price : " + fifth_bookNameELe.getText());
        
        //Close browser
        driver.quit();

		
	}

}
