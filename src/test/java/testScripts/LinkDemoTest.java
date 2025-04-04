package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkDemoTest {
	@Test
//Link - navigates users to some other page using hyperlink
	// test case - link is displayed or not, link is enabled or not, click on link,
	// and get name of link in runtime

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.facebook.com/r.php");

		// maximize the browser window
		driver.manage().window().maximize();

		// identify the link -using link text or partial link text
		WebElement Link1 = driver.findElement(By.linkText("Already have an account?"));

		// display status of link
		boolean IsDisplayedStatus = Link1.isDisplayed();
		System.out.println("is Displayed status is : " + IsDisplayedStatus);

		// enable status of link
		boolean isEnabledStatus = Link1.isEnabled();
		System.out.println("is Enabled status is : " + isEnabledStatus);

		// get the link name
		String linkName = Link1.getText();
		System.out.println("Link name is : " + linkName);
		;

		// click on link
		Link1.click();

	}
}
