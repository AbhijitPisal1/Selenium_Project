package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IdAndNameLocatorsTest {
	@Test
	public static void main(String[] args) {

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open face book URL
		driver.get("https://www.facebook.com");

		// enter email id by id locator
//id - locator with unique values 
//generic in nature can identify any element, text box, radio button , check box but has to be given a   value in  in html 
//NoSuchElementException if element with given id value not found
		driver.findElement(By.id("email")).sendKeys("test@test.com");

		// enter password by name locator
//Name locator generic in nature	
		driver.findElement(By.name("pass")).sendKeys("12345");

	}
}
