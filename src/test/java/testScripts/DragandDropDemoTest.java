package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragandDropDemoTest {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// Open google in chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// open Application
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		// select parent iframe
		driver.switchTo().frame(0);
		// no other iframe present on page so index is 0

		// drag and drop operation
		WebElement smallbox = driver.findElement(By.id("draggable"));
		WebElement bigbox = driver.findElement(By.id("droppable"));

		// create a new object of Actios class
		Actions action = new Actions(driver);
		action.dragAndDrop(smallbox, bigbox).build().perform();
		// format is ClassObject.dragAndDrop(source, target);

	}
}
