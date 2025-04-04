package testScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomationBookstoreTest {
	@Test
	public void test() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://automationbookstore.dev/");

//	// take screenshot of entire page
//	  TakesScreenshot screen = (TakesScreenshot)driver;
//	  File src = screen.getScreenshotAs(OutputType.FILE);
//	  String path = System.getProperty("user.dir")
//	  		+ "/screenshots/"+ "Evidence_"+System.currentTimeMillis() +".png";
//	  FileUtils.copyFile(src, new File(path));
//	  
//	  
		driver.findElement(By.id("searchBar")).sendKeys("test");
		Thread.sleep(5000);

		WebElement closeIcon = driver.findElement(By.xpath("//a[@title='Clear text']"));
		boolean status = closeIcon.isDisplayed();

//	// Take screenshot of single element
//	  File srcImg	= closeIcon.getScreenshotAs(OutputType.FILE);
//	  String path1 = System.getProperty("user.dir")
//			  +"/screenshots/" + "Evidence_" +System.currentTimeMillis() +".png";
//	  FileUtils.copyFile(srcImg, new File(path1));

		System.out.println("staus of closeIcon button is " + status);

		if (closeIcon.isDisplayed()) {
			closeIcon.click();
		}
		driver.quit();
	}
}
