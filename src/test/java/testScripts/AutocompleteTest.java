package testScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutocompleteTest {
	public final String expected = "JavaScript";
  @Test
  public void practice() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.get("https://jqueryui.com/autocomplete/");
	  
	  WebElement frame1 = driver.findElement(By.cssSelector(".demo-frame"));
	  driver.switchTo().frame(frame1);
	  
	  WebElement input1 = driver.findElement(By.id("tags"));
	  input1.sendKeys("as");
	  Thread.sleep(3000);
	  
	  List<WebElement> items = driver.findElements(By.cssSelector("ul#ui-id-1 > li"));
	  
	  System.out.println("The Number of matching items is :"+items.size());
	  
	  for (WebElement item :items) {
		  System.out.println(item.getText());
		  
		  if (item.getText().equalsIgnoreCase(expected)) {
			  item.click();
			  break;
			  
		  }
	  }
		driver.quit();  
  }
}
