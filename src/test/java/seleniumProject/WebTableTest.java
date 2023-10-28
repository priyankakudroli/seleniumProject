package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		
		List<WebElement> tableRows = driver.findElements(By.cssSelector("#example_wrapper #example >tbody >tr"));
		
		int noOfTableRows = tableRows.size();//10
		
		for (WebElement row : tableRows) 
		
		{
			List<WebElement> colNames = driver.findElements(By.cssSelector("\"#example_wrapper #example >tbody >tr:nth-child(row)>td\""));
			colNames.size();
			
			for (WebElement column : colNames) 
			{
		
				System.out.println(column.getAttribute("td"));
			}
		}


	}

}
