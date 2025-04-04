package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrameNestedTest {
	@Test
//nested iframe is an iframe iside another bigger iframe
	// parent child relation between iframes
	// first switch to parent iframe and then switch to child iframe to work with
	// elements inside child iframe
	// same way - exit the child iframe first and go into the parent iframe
	// then exit parent iframe and return to main content

	public static void main(String[] args) {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		// maximize browser window
		driver.manage().window().maximize();

		// switch to parent frame from main content
		driver.switchTo().frame("frame-top");

		// switch to child frame
		driver.switchTo().frame("frame-middle");

		// identify the webElement
		WebElement text = driver.findElement(By.id("content"));

		// get the text of webelement
		System.out.println("Text of second frame is :" + text.getText());

		// come out from child frame to parent frame
		driver.switchTo().parentFrame();

		// comeout from parent frame to html main content
		driver.switchTo().defaultContent();

	}
}
