package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckBoxDemoTest {
	@Test
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		// identify check box
		WebElement CheckBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

		// displayed or not
		boolean isDisplayedStatus = CheckBox1.isDisplayed();
		System.out.println("The checkbox 1 is dispayed status is " + isDisplayedStatus);
		// enabled or not status
		boolean isEnabledStatus = CheckBox1.isEnabled();
		System.out.println("The checkbox 1 is enabled status is " + isEnabledStatus);

		// select the check box
		CheckBox1.click();
		Thread.sleep(5000);
		// check selected status of check box
		boolean IsSelectedStatus = CheckBox1.isSelected();
		System.out.println("The checkbox 1 is selected staus is " + IsSelectedStatus);
		// un select the check box
		CheckBox1.click();

	}
}
