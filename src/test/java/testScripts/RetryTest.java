package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RetryTest {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://danube-webshop.herokuapp.com/");
	}

	@Test
	public void crimeNovelSearch() {
		driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
		String strURL = driver.getCurrentUrl();
		Assert.assertTrue(strURL.contains("crime"));
	}

	@Test (retryAnalyzer = RetryAnalyserImpl.class)
	public void StoriesSearch() {
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
		String strURL = driver.getCurrentUrl();
		Assert.assertTrue(strURL.contains("novel stories")); // this will fail for novel stories
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}
