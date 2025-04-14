package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertTest {
	@Test
	public void practice() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");

		driver.findElement(By.id("alertBtn")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText(), "I am an alert box!"); // this is hard assert- if it fails script will stop
		alert.accept();

		driver.findElement(By.id("confirmBtn")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println(confirm.getText());
		SoftAssert softasserts = new SoftAssert(); // if soft assert fails- script will not stop and continue running
													// the script - passing it eventually
//	 softasserts.assertEquals(confirm.getText(), "Press a button");		// this will fail
		softasserts.assertEquals(confirm.getText(), "Press a button!");
		confirm.dismiss();

		driver.findElement(By.id("promptBtn")).click();
		Alert prompt = driver.switchTo().alert();
		prompt.sendKeys("Hello Welcome");
		prompt.accept();

		softasserts.assertAll(); // if any of the soft asserts fail, it will mark entire run as failed even
									// though entire script has ran completely

		driver.quit();

	}

}
