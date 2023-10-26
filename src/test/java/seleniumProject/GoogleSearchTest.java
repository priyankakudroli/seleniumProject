package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.id("APjFqb")).sendKeys("selenium tutorial");
		driver.getTitle();
		Thread.sleep(2000);
		List<WebElement> items = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li//descendant::div[@class='wM6W7d']"));
		System.out.println(items.size());
		
		for (WebElement item : items) 
		{
			System.out.println(item.getText());
			if(item.getText().equalsIgnoreCase("Selenium tutorial pdf"))
			{
				item.click();
				break;
			}
		}
	}

}
