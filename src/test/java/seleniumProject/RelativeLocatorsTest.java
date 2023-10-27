package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsTest {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationbookstore.dev/");
		
		String StrID = driver.findElement(RelativeLocator.with(By.tagName("li")).below(By.id("pid1")).toLeftOf(By.id("pid6"))).getAttribute("id");
		System.out.println(StrID);
		
		driver.findElement(By.id("searchBar")).sendKeys("Test");
		
		WebElement closeBtn = driver.findElement(By.xpath("//a[text()='Clear text']"));
		
		if(closeBtn.isDisplayed())
		{
			closeBtn.click();
			System.out.println("The clear button has been clicked");
		}
		
	}

}
