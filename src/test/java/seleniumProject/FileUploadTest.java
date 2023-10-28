package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		WebElement addFile = driver.findElement(By.cssSelector("input[type='file']"));
		
		String strPath = System.getProperty("user.dir") + "//demo.png";
		addFile.sendKeys(strPath);
		
		driver.findElement(By.cssSelector(".start")).click();
		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
		driver.close();
		
	}

}
