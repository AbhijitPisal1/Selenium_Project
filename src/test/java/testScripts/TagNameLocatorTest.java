package testScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameLocatorTest {

	// locate elements using TagName value of element
	// locates multiple elements having same TagName
	// TagName is mandatory for every element in html

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Facebook URL
		driver.get("https://www.facebook.com");

		// get a list of links by using tagname a
		List<WebElement> AllWebLinks = driver.findElements(By.tagName("a"));
		System.out.println("the number of all web links in page are : " + AllWebLinks.size());

		// to get name of all links we have to iterate every element in AllWebLinks list
		for (int i = 0; i < AllWebLinks.size(); i++) {
			System.out.println(AllWebLinks.get(i).getText());
		}
	}

}
