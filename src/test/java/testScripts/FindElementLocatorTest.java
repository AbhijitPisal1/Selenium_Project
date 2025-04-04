package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementLocatorTest {
	@Test
//findElement()
	// locates single element
	// returns single webElement
	// throws NoSuchElementException when locator is not matched

	// findElements()
	// locates multiple elements
	// returns list<WebElement>
	// Does not throw any exception and returns empty list<WebElement> when locator
	// is not matched
	public static void main(String[] args) {

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open google.com URL
		driver.get("https://www.google.com");

		// identify search text box and enter some text

		WebElement SearchtextBox = driver.findElement(By.name("q"));
		SearchtextBox.sendKeys("Selenium");

		// get a list of all links using findElements() method
		List<WebElement> AllLinksonPage = driver.findElements(By.tagName("a"));
		System.out.println("The number of links are : " + AllLinksonPage.size());
	}
}
