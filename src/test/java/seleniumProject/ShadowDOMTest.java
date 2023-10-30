package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMTest 
{
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		WebElement shadowHost = driver.findElement(By.cssSelector(".smart-ui-component"));
		SearchContext shadowRoot = shadowHost.getShadowRoot();
		WebElement shadowContent = shadowRoot.findElement(By.cssSelector(".smart-menu"));
		
		System.out.println(shadowContent.getText());
	}

}
