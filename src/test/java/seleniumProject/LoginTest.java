package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.cssSelector(".fa-sign-in")).click();
		
		driver.findElement(By.partialLinkText("Elemental")).click();

	}

}
