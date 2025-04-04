package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonDemoTest {
	@Test
//single selection - functionality to select a single option from multiple options
	// test cases- button displayed or not, button enabled or not, select a radio
	// button
	// check selected status, un-select any selected button

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.facebook.com/r.php");

		// maximize the browser window
		driver.manage().window().maximize();

		// get a list of all radio buttons using findElements() method
		List<WebElement> AllRadioButtonsonPage = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("The number of radio buttons are : " + AllRadioButtonsonPage.size());

		// identify radio button elements
		WebElement FirstRadioButton = driver.findElement(By.xpath("//input[@value='1']"));

		// check if displayed or not
		boolean IsDisplayedStatus = FirstRadioButton.isDisplayed();
		System.out.println("Is radio button displayed : " + IsDisplayedStatus);

		// check enable status
		boolean isEnabledStatus = FirstRadioButton.isEnabled();
		System.out.println("Is radio button enabled : " + isEnabledStatus);

		// select a radio button
		FirstRadioButton.click();
		Thread.sleep(5000);

		// check selected status of radio button
		boolean isSelectedStaus = FirstRadioButton.isSelected();
		System.out.println("Is radio button selected : " + isSelectedStaus);

		// unselect the radio button-- selecting another radio button
		WebElement SecondRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
		SecondRadioButton.click();

	}
}
