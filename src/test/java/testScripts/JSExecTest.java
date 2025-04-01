package testScripts;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// medium that enables the WebDriver to interact with HTML elements within the browser
//executeScript method – This method executes the test script in the context of the currently selected window or frame. 
						// The script in the method runs as an anonymous function
// executeAsyncScript method – This method executes the asynchronous piece of JavaScript on the current window or frame. 
							// An asynchronous script will be executed while the rest of the page continues parsing, which enhances responsiveness and application performance.

public class JSExecTest {
  @Test
  public void test() {
	  
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  String strTitle = (String) js.executeScript("return document.title");
	  System.out.println(strTitle);
	  
	  WebElement input1 = (WebElement) js.executeScript("return document.getElementById('name')");
	  input1.sendKeys("TestUser");
	  
	  js.executeScript("window.scrollBy(100, document.body.scrollHeight)");
	  
	  
	  driver.quit();
	  
  }
}
