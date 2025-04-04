package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UploadFileTest {
	@Test
	public void upload() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
		String strpath = System.getProperty("user.dir") + "//screenshots//" + "Evidence_1743068564189.png";
		addFile.sendKeys(strpath);

		driver.findElement(By.xpath("//span[contains(text(),'Start upload')]")).click();

		driver.quit();

	}
}
