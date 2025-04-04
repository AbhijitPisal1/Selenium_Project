package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalenderDemoTest {
	@Test
//input field to select a date
	// testcase - to open a calendar, select date, go to next month or previous
	// month

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.skyscanner.com/");

		// maximize the browser window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// identify and open the departure calendar
		WebElement DepartureCalendarIcon = driver
				.findElement(By.xpath("//span[contains(text(),'Depart')]//following-sibling::span"));
		DepartureCalendarIcon.click();
		Thread.sleep(2000);

		// Select departure date
		WebElement todayDate = driver.findElement(By.xpath("//button[contains(@class,'today')]"));
		todayDate.click();

		// select return date
		WebElement ReturnCalendarIcon = driver
				.findElement(By.xpath("//span[contains(text(),'Return')]//following-sibling::span"));
		ReturnCalendarIcon.click();
		Thread.sleep(2000);

		// Select next month
		driver.findElement(By.xpath("//button[contains(@aria-label, 'Next month')]")).click();

		// Select departure date
		WebElement ReturnDate = driver.findElement(By.xpath("//button[contains(@aria-label, 'April 12')]"));
		ReturnDate.click();

		//

	}

}
