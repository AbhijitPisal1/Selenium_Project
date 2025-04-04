package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassNameLocatorTest {
	@Test
//ClassName locates elements by using class attribute value
	// multiple elements having same class attribute value can be located
	// element must have class attribute

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Facebook URL
		driver.get("https://www.facebook.com");

		// capture all text boxes of login page using classname locator
		List<WebElement> alltextBoxes = driver.findElements(By.className("inputtext"));
		System.out.println("Total text boxes are : " + alltextBoxes.size());

		alltextBoxes.get(0).sendKeys("test@test.com");
		alltextBoxes.get(1).sendKeys("123456");

	}

}
