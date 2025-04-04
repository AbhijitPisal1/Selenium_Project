package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTabDemoTest {
	@Test
//multiple tabs in browser
	// link opens new tab is same browser
	// every window has a unique id assigned by selenium
	// switch between windows by using window id
	public static void main(String[] args) throws InterruptedException {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// maximize browser window
		driver.manage().window().maximize();

		// open Application
		driver.get("https://www.facebook.com/reg/");

		// get the window id of initail tab -- string output of id of single window
		String firstTabId = driver.getWindowHandle();
		System.out.println("First tab window id is :" + firstTabId);

		// click on learn more link
		driver.findElement(By.id("non-users-notice-link")).click();

		// switch the focus from initial tab to new tab
		Set<String> AllWindowHandles = driver.getWindowHandles();
		for (String a : AllWindowHandles) {
			if (!a.equals(firstTabId)) {
				driver.switchTo().window(a);
			}
		}

		// click on support inbox link on new tab
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Support Inbox']")).click();

		// switch focus from new tab to initial tab
		driver.switchTo().window(firstTabId);

		// Enter first name in text box
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("text");

	}
}
