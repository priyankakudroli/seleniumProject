package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
//		WebElement searchBox = driver.findElement(By.id("search"));
//		action.contextClick(searchBox).perform();
		
		WebElement components = driver.findElement(By.cssSelector("#narbar-menu >ul >li:nth-child(3)"));
		WebElement menu = driver.findElement(By.cssSelector("#narbar-menu >ul >li:nth-child(3)>div>div>ul>li:nth-child(2)"));
	
//		action.moveToElement(components).perform();
//		action.moveToElement(menu).perform();
		
		action.moveToElement(components).click(menu).build().perform();
		action.scrollToElement(driver.findElement(By.cssSelector("img[src*=\"apple_cinema\"]"))).click();
	}

}
