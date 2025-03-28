package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDOMTest {
  @Test
  public void shadow() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://the-internet.herokuapp.com/shadowdom");
	  Thread.sleep(5000);
	  WebElement shadowHost = driver.findElement(By.xpath("(//my-paragraph)[1]"));
	  SearchContext ctx = shadowHost.getShadowRoot();
	  
	  WebElement txt = ctx.findElement(By.cssSelector("slot[name='my-text']"));
	  System.out.println(txt.getText());
	  
	  
	  String text1 = driver.findElement(By.xpath("//span[@slot='my-text']")).getText();
	  System.out.println(text1);
	  
	  driver.quit();
  }
}
