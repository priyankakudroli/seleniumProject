package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButtonTest {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		
		boolean isAgeClicked = driver.findElement(By.id("isAgeSelected")).isSelected();
		
		if(!isAgeClicked)
		{
			driver.findElement(By.id("isAgeSelected")).click();
		}
		
		driver.close();
	}

}
