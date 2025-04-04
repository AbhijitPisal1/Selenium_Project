package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IframeDemoTest {
	@Test
//iframe - webpage embedded in a HTML page
	// <iframe>Code is written here</iframe>
	// iframe contains various web elements
	// no limitation on iframes in a webpage
	// selenium cannot directly identify element inside iframe
	// switch to iframe to allow selenium to identify element
	// switch using iframe id or name or iframe index
	// once task is done,unselect iframe for focus to return in main html page

	public static void main(String[] args) throws InterruptedException {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://jqueryui.com/dialog/");

		// maximize browser window
		driver.manage().window().maximize();

		// select the frame
		driver.switchTo().frame(0);
		Thread.sleep(2000);

		// close the dialog box
		driver.findElement(By.xpath("//button[@title='Close']")).click();

		// switch back to main page outside of the iframe
		driver.switchTo().defaultContent();

		// click on demos link
		driver.findElement(By.linkText("Demos")).click();

	}

}
