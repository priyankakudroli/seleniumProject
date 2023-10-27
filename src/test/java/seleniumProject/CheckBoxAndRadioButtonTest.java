package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxAndRadioButtonTest {
	
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
		//CheckBox Test
		boolean isAgeClicked = driver.findElement(By.id("isAgeSelected")).isSelected();
		
		if(!isAgeClicked)
		{
			driver.findElement(By.id("isAgeSelected")).click();
		}
		
		//RadioButtonTest
		
		driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		WebElement ageGroup = driver.findElement(By.xpath("//input[@value ='15 - 50']"));
		
		if(!ageGroup.isSelected())
		{
			ageGroup.click();
			System.out.println("The 5-15 age group option is selected");
		}
		driver.close();
	}

}
