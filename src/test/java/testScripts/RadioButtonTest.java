package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtonTest {
	@Test
	public void practice() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement firstRadio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		firstRadio.click();

		boolean isSelect = firstRadio.isSelected();
		if (isSelect) {
			System.out.println("The First radio button is selected :" + isSelect); // status should be true
			System.out.println("Now trying to click on second radio button");
			WebElement SecondRadio = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
			SecondRadio.click();
			System.out.println("The Second radio button is selected :" + SecondRadio.isSelected()); // status should be
																									// true
		}

		driver.quit();
	}

}
