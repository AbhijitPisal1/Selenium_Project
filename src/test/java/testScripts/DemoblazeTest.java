package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoblazeTest {
	String ExpectedItem = "Iphone 6 32gb";
	
  @Test
  public void practice() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://demoblaze.com/");
	  Thread.sleep(5000);
	  List<WebElement> items = driver.findElements(By.xpath("//h4[@class='card-title']"));
	  
	  for (WebElement item : items) {
		  if(item.getText().equalsIgnoreCase(ExpectedItem)) {
			  item.click();
			  Thread.sleep(2000);
			  break;
		  }
	  } 
	  driver.quit();
  }
}
