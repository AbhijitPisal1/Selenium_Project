package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CommonMethodDemoTest {
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://the-internet.herokuapp.com/");

		// maximize browser window
		driver.manage().window().maximize();

		// get title of page
		String title = driver.getTitle();
		System.out.println("The Title of application is : " + title);

		// get URL of page
		String URL = driver.getCurrentUrl();
		System.out.println("The URL is : " + URL);

		// click on any link on page
		driver.findElement(By.xpath("//a[contains(@href, 'broken')]")).click();

		// navigate back to main page
		driver.navigate().back();
		Thread.sleep(2000);

		// navigate forward to new page
		driver.navigate().forward();
		Thread.sleep(2000);

		// refresh the application page
		driver.navigate().refresh();

		driver.navigate().back();

		// open new tab using clicking elemental selenium link
		driver.findElement(By.linkText("Elemental Selenium")).click();
		Thread.sleep(2000);

		// close single tab by using .close method
		driver.close();
		Thread.sleep(2000);

		// close the entire browser window by quit method
		driver.quit();

	}
}
