package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseTest {
	@Test
	public void practice() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://testautomationpractice.blogspot.com/");

		Actions action = new Actions(driver);

		WebElement txtfield = driver.findElement(By.id("field2"));
		action.scrollToElement(txtfield).perform();

		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'Point Me')]"));
		action.moveToElement(btn).perform();

		WebElement item2 = driver.findElement(By.linkText("Laptops"));
		action.click(item2).perform();

		Thread.sleep(3000);
//	  action.moveToElement(btn).click(item2).build().perform();

		WebElement btnDbl = driver.findElement(By.xpath("//button[contains(text(),'Copy Text')]"));
		action.doubleClick(btnDbl).perform();

//	  action.contextClick(txtfield).perform();

		// perform drag and drop
		WebElement slider = driver.findElement(By.xpath("//*[contains(text(),'Slider')]"));
		action.scrollToElement(slider).perform();
		Thread.sleep(3000);
		WebElement src1 = driver.findElement(By.xpath("//div[@id='draggable']//p"));
		WebElement targetLoc = driver.findElement(By.xpath("//div[@id='droppable']//p"));
		action.dragAndDrop(src1, targetLoc).build().perform();

		driver.quit();
	}

}
