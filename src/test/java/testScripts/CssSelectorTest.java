package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorTest {
	@Test
//CSS - Cascading style sheets
	// alternative for xpath - faster

//RULES - 
	// using id attribute -- prefix # before value
	// ex: input#user-name
	// using class attribute -- prefix . before value
	// ex: input.submit-button
	// using any other attribute -- tagname[attribute='value']
	// ex: input[name='password']
	// using multiple attribute -- tagname[attribute1='value1'][attribute2='value2']
	// ex: input[type='text'][name='user-name']
	// contains -- symbol * used
	// ex: input[type*='pass']
	// starts with locator -- symbol ^ used
	// ex: input[name^='pass']
	// ends with locator -- symbol $ used
	// ex: input[name$='word']

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// open saucedemo URL
		driver.get("https://www.saucedemo.com/");

		// enter user name
		driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
		// enter password
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
		// click on login button
		driver.findElement(By.cssSelector("input.submit-button")).click();

	}
}
