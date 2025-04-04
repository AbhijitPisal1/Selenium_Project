package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSDemo1Test {
	@Test
	public static void main(String[] args) throws InterruptedException {

		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(5000);

		// Enter Username
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].value='Admin'", userName);
		Thread.sleep(5000);

		// Enter Password
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		js.executeScript("arguments[0].value='admin123'", password);
		Thread.sleep(5000);
		// another way is to use webpage console to get element location
		// js.executeScript("document.getElementById('txtPassword').value='admin123' ");

		// click on login button
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", loginBtn);

		// get title
		String Title = js.executeScript("return document.title").toString();
		System.out.println("Title of the page is :" + Title);

		// Get URL
		String url = js.executeScript("return document.URL").toString();
		System.out.println("The URL of page is :" + url);

	}

}
