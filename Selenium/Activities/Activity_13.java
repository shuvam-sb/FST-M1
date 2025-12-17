package examples;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity_13 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://training-support.net/webelements/tables");
		System.out.println("Page title : " + driver.getTitle());
		
		//Print no rows
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		System.out.println("Number of rows in the table is : "+rows.size());
		
		//Print no columns
		List<WebElement> columns = driver.findElements(By.xpath("//table//thead/tr//th"));
		System.out.println("Number of columns in the table is : "+columns.size());
		
		
		//Print 3rd row content
		List<WebElement> third_row_data = driver.findElements(By.xpath("//table//tbody//tr[3]//td"));
		System.out.println("Values in third row are  : ");
		for(WebElement ele : third_row_data) {
			System.out.println(ele.getText());
		}
		// Print the cell value of the second row and second column
        WebElement cellVal = driver.findElement(By.xpath("//table//tbody//tr[2]//td[2]"));
        System.out.println("Second row, second cell value: " + cellVal.getText());

		//Close browser
		driver.quit();
		
	}
}
