package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActionsTest {
	@Test
	public static void main(String[] args) throws InterruptedException {

		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.manage().window().maximize();

		// open Application
		driver.get("https://www.amazon.in/");

		// move mouse over Account and list link
		WebElement accountLink = driver.findElement(By.id("nav-orders"));

		// new object of actions class of selenium
		Actions action = new Actions(driver);

		action.moveToElement(accountLink).build().perform();
		Thread.sleep(2000);

		// Click on orders link
		WebElement yourOrderLink = driver.findElement(By.xpath("//span[text()='Your Orders']//parent::a"));
		action.click(yourOrderLink).build().perform();

		// enter email id
		WebElement emailLink = driver.findElement(By.id("ap_email"));
		action.sendKeys(emailLink, "test@test.com").build().perform();
	}
}
