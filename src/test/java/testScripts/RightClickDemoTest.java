package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickDemoTest {
	@Test
	public static void main(String[] args) {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		// open Application
		driver.get("https://www.facebook.com/");

		// right click action on email text box
		WebElement emailtextbox = driver.findElement(By.id("email"));

		Actions action = new Actions(driver);
		action.contextClick(emailtextbox).build().perform();
		// Context click for right click

	}
}
