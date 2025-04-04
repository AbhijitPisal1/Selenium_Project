package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathLocatorTest {

// XML path of element 
// useful when Id and Name attribute are not given
// travels to element using tag name
	// useful for dynamic elements by dynamic XPath
	// dynamic elements are the elements where value is changing at runtime

// Absolute Xpath OR Full path
	// travel from root element with html tag
	// long syntax - cannot skip any tags in between
	// starts with /
	// not recommended

// Relative Xpath
	// starts with //
	// allows to search element from anywhere in html page
	// format //TagName[@attribute='Value']
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open face book URL
		driver.get("https://www.facebook.com");

		// enter email id value by XPath locator

		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"))
				.sendKeys("test@test.com");

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12343222");

	}

}
