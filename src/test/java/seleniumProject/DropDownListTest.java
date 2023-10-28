package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
		Select singleselect = new Select(driver.findElement(By.cssSelector(".form-control#select-demo")));
		singleselect.selectByVisibleText("Wednesday");
		singleselect.selectByIndex(1);
		

		Select multiSelect = new Select(driver.findElement(By.id("multi-select")));
		multiSelect.selectByIndex(0);
		multiSelect.selectByValue("New Jersey");
		//driver.findElement(By.xpath("//button[text()='Get All Selected']")).click();
		List <WebElement> items = multiSelect.getAllSelectedOptions();
		System.out.println(items);
		
	}

}
