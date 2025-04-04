package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CSSValidationDemoTest {
	@Test
//CSS - language to set the look and feel of any document/element- beautification 
	// test case- color alignment, text alignment and font

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://the-internet.herokuapp.com/forgot_password");

		// Identify element
		WebElement button = driver.findElement(By.id("form_submit"));

		// css validations
		String BorderStyleAttr = button.getCssValue("border-style");
		System.out.println("the border style is :" + BorderStyleAttr);

		String textAlignAttr = button.getCssValue("text-align");
		System.out.println("the text alignment  is :" + textAlignAttr);

		String BackgroundColorAttr = button.getCssValue("background-color");
		System.out.println("the background color is :" + BackgroundColorAttr);

	}

}
