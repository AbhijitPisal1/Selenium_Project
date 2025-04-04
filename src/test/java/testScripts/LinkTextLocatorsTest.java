package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkTextLocatorsTest {
	@Test
//to identify the web link - to click on any link
	// cannot be used for text box, radio button etc.
	public static void main(String[] args) {

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open face book URL
		driver.get("https://www.facebook.com");

		// click on forgot password
//LinkText : exact details/name of web link has to be given
		// used when the name of link will be fixed
		driver.findElement(By.linkText("Forgotten password?")).click();
//PartialLinkText : no need of exact name of web link has to be given
		// used when the name/details of link will be changing at run time
//			driver.findElement(By.partialLinkText("password?")).click();
	}
}
