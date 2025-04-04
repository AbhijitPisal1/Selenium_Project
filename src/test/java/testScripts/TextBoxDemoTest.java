package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextBoxDemoTest {
	@Test
//text box is input box where values can be added
	// check whether text box is displayed or not
	// check whether text box is enabled or not
	// enter value in text box, fetch value or delete value entered

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open face book URL
		driver.get("https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");

		// identify the text box
		WebElement emailTextBox = driver.findElement(By.id("identify_email"));

		// text box is displayed or not
		boolean isDisplayedStatus = emailTextBox.isDisplayed();
		System.out.println("Is Displayed status is : " + isDisplayedStatus);

		// text box is enabled or not
		boolean enabledStatus = emailTextBox.isEnabled();
		System.out.println("Is enabled status is : " + enabledStatus);
		// enter value in text box
		emailTextBox.sendKeys("Test@test.com");

		// fetch values entered in text box
		String enteredValue = emailTextBox.getAttribute("Value");
		System.out.println("Entered value is : " + enteredValue);
		// delete the value entered in text box
		emailTextBox.clear();

	}
}
