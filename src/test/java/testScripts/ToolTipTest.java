package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToolTipTest {
	@Test
	public void tooltip() {
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/tooltip/");

		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
//	  driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.id("age"));
//	  age.sendKeys(Keys.ARROW_DOWN);
		actions.moveToElement(age).perform();

		String strTxt = driver.findElement(By.className("ui-tooltip-content")).getText();
		System.out.println("The Tooltip text is .. " + strTxt);
		Assert.assertEquals(strTxt, "We ask for your age only for statistical purposes.");
		age.sendKeys("20");

		driver.switchTo().defaultContent();

		String strHeader = driver.findElement(By.tagName("h1")).getText();
		System.out.println(strHeader);

		driver.quit();
	}
}
