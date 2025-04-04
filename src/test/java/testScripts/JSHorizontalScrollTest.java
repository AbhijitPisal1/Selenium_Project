package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSHorizontalScrollTest {
	@Test
//scroll from right to left and left to right possible

	public static void main(String[] args) {

		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.album.alexflueras.ro/");

		// scroll left to right
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Img1 = driver.findElement(By.id("a7"));
		js.executeScript("arguments[0].scrollIntoView()", Img1);

		// scroll from right to left
		WebElement Img2 = driver.findElement(By.id("a3"));
		js.executeScript("arguments[0].scrollIntoView()", Img2);

		// can we go to end to left or end to right

	}

}
