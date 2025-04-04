package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDemoTest {
	@Test
	// drop-down - shows a list of options from which user can select a option
	// test case- get a list of all options from drop-down, select a value, and get
	// the selected value from list

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://www.facebook.com/r.php");

		// maximize the browser window
		driver.manage().window().maximize();

		// identify where drop-down element is present
		WebElement month = driver.findElement(By.id("month"));

		// select a value from list- create a object of select class from selenium api
		// to work with drop-down
		Select selectmonth = new Select(month);

		// get all options
		List<WebElement> AllOptions = selectmonth.getOptions();

		// get total number of options
		System.out.println("The total number of options are :" + AllOptions.size());

		// get values of all options
		for (int i = 0; i < AllOptions.size(); i++) {
			System.out.println(AllOptions.get(i).getText());
		}

		selectmonth.selectByIndex(2); // select option from index of options

		// selectmonth.selectByValue("5"); // selecting option from its value attribute

		// selectmonth.selectByContainsVisibleText("Jun");

		// get selected value from drop-down
		WebElement Selectedoption = selectmonth.getFirstSelectedOption();
		String SelectedValue = Selectedoption.getText();
		System.out.println("Selected value from drop down is : " + SelectedValue);
	}

}
