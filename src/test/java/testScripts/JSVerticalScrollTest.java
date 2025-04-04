package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSVerticalScrollTest {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.facebook.com/privacy/explanation");

		Thread.sleep(5000);
		// scroll down page to see manual review link on screen
		WebElement ReviewLink = driver.findElement(By.linkText("manual review"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ReviewLink);

		// scroll down the page till end
		js.executeScript("window.scrollTo(0 , document.body.scrollHeight)");

		// can we scroll from bottom of page to top of page

	}
}
