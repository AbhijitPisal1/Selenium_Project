package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckboxTest {
	@Test
	public void practice() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		WebElement Firstbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		Firstbox.click();
		System.out.println("The First checkbox is selected :" + Firstbox.isSelected()); // status should be true

		WebElement SecondBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		boolean isSelect = SecondBox.isSelected();
		System.out.println("The Second checkbox is selected :" + isSelect); // status should be true
		if (isSelect) {
			SecondBox.click();
			System.out.println("The Second checkbox is selected :" + SecondBox.isSelected()); // status should be false
		}
		driver.quit();
	}
}
