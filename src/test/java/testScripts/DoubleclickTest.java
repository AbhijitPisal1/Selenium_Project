package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleclickTest {
	@Test
	public static void main(String[] args) {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");

		// select iframe
		driver.switchTo().frame("iframeResult");

		// perform double click event
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-click me']"));

		Actions action = new Actions(driver);
		action.doubleClick(button).build().perform();

		// return to main content
		driver.switchTo().defaultContent();
	}

}
