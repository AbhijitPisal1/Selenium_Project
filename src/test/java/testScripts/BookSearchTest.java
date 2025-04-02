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

public class BookSearchTest {
	WebDriver driver;
	@Parameters ("broswer")
	@BeforeMethod
	public void setup(String strBrowser) {
		if(strBrowser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
		}
		else if (strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://danube-webshop.herokuapp.com/");
	}
	
//  @Test (priority=3)		// by default the order of execution will be alphabetical sequence of method names
							//  to change that we can provide priority : -3, -2, -1, 1, 2, 3 etc... 
  @Test
  public void crimeNovelSearch() {
	  driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
	  String strURL= driver.getCurrentUrl();
	  Assert.assertTrue(strURL.contains("crime"));
  }
  
  @Test
  public void StoriesSearch() {
	  driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	  String strURL= driver.getCurrentUrl();
	  Assert.assertTrue(strURL.contains("novel"));			// this will fail for novel stories
  }
  
  @Test (alwaysRun = true,  dependsOnMethods = "StoriesSearch")
  public void FantasySearch() {
	  driver.findElement(By.xpath("//a[contains(text(),'Fantasy')]")).click();
	  String strURL= driver.getCurrentUrl();
	  Assert.assertTrue(strURL.contains("fantasy"));
  }
  
//@Test (enabled=false)			// making enables status as false will not run his particular test method
//  @Test
  public void HorrorSearch() {
	  driver.findElement(By.xpath("//a[contains(text(),'Horror')]")).click();
	  String strURL= driver.getCurrentUrl();
	  Assert.assertTrue(strURL.contains("horror"));
  }
  
  @AfterMethod
  public void teardown() {
	  driver.close();
  }
}
