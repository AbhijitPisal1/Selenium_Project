package testScripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitTest {
  @Test
  public void test() {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	  driver.get("http://uitestingplayground.com/ajax");
	  
//	  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("ajaxButton"))));
	  driver.findElement(By.id("ajaxButton")).click();
	  
//	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("div#content > p"))));
	  
	  wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.cssSelector("div#content")), "Data loaded with AJAX get request."));
	  
	  String strTxt = driver.findElement(By.cssSelector("div#content")).getText();
	  System.out.println(strTxt);
 
  // additional fluent wait method
	  //allows one to wait for a specific condition to be met with a custom frequency of checking the condition.
	  //Fluent Wait looks for a web element repeatedly at regular intervals until timeout happens or until the object is found
//	  WebElement srcbox = driver.findElement(By.id("search"));
//	  Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver)
//			  .withTimeout(Duration.ofSeconds(30))
//			  .pollingEvery(Duration.ofSeconds(5))
//			  .ignoring(NoSuchElementException.class);
//	  wait2.until(ExpectedConditions.elementToBeClickable(srcbox));
//  
  
	  driver.quit();
  }
  
}
