package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownTest {
	@Test
	public void practice() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");
		Select sel = new Select(driver.findElement(By.id("country")));
		boolean status = sel.isMultiple();
		System.out.println("the dropdown is multi select :" + status);

//	  sel.selectByIndex(2);
//	  sel.selectByValue("japan");
		sel.selectByVisibleText("Brazil");

		Select MulSel = new Select(driver.findElement(By.id("colors")));
		if (MulSel.isMultiple()) {
			MulSel.selectByIndex(2);
			MulSel.selectByValue("white");
			MulSel.selectByVisibleText("Green");

			List<WebElement> items = MulSel.getAllSelectedOptions();
			System.out.println(items.size());

			MulSel.deselectByValue("white");

		}
		driver.quit();
	}
}
