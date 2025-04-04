package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSAlertDemoTest {
	@Test
//JS- OOOP language - to create interactive elements of a  webpage
	// browser understand JS by default-- no need for any installations

	// why use js from selenium--click on button, enter value in textbox, scroll
	// down page etc.
	// selenium interface - javascriptexecutor
	// to click on button: js.executeScripts("arguments[0].click()",btn);
	// to enter value in textbox :
	// js.executeScripts("arguments[0].value="TESTer",txtbox);;

	// Alert - message box displayed for notification/information
	// asks user to allow or deny permission
	// developed in JS -- no locators

	// Handle alert in selenium
	// Use of Alert interface which contains multiple meyhods for JS alert
	// switch to alert from normal window
	// conatains accept(), dismiss() methods
	public static void main(String[] args) throws InterruptedException {

		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// maximize browser window
		driver.manage().window().maximize();

		// click on button to get JS alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(2000);

		// switch the focus from html page to JS alert
		Alert al = driver.switchTo().alert();

		// perform operation on JS alert using alert interface methods
		// get text from alert
		String Al_text = al.getText();
		System.out.println("the Alert text is : " + Al_text);

		// click on ok-- aceept() , cancel-dismiss()
		al.accept();
		al.dismiss();
		driver.switchTo().defaultContent();

	}
}
