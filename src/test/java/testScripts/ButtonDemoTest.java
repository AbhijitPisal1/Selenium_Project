package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonDemoTest {
	@Test
//button to  submit data
	// test cases - displayed status, enabled status, click on button and name iof
	// button
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

		// identify button element
		WebElement button1 = driver.findElement(By.xpath("//div[@class='example']//child::button"));

		// check displayed status
		boolean IsDisplayedStatus = button1.isDisplayed();
		System.out.println("Is button displayed status : " + IsDisplayedStatus);

		// check enabled status
		boolean IsEnabledStatus = button1.isEnabled();
		System.out.println("Is button Enabled status : " + IsEnabledStatus);

		// get name of button
		String ButtonName = button1.getText();
		System.out.println("The Name of Button is : " + ButtonName);

		// perform click operation on button
		button1.click();

		// check if button is present from text
		WebElement button2 = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));

		boolean newButtonDisplayed = button2.isDisplayed();
		System.out.println("The new button displayed status is :" + newButtonDisplayed);
	}
}
