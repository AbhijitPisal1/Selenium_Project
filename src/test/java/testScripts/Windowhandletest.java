package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Windowhandletest {
  @Test
  public void newtest() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://demoqa.com/browser-windows");
	  
	  String parentwin = driver.getWindowHandle();
	  Thread.sleep(3000);
	  System.out.println("1. The title of webpage is ....."+driver.getTitle());
	  
	  Actions action = new Actions(driver);
	  action.scrollByAmount(100, 1200).perform();
	  
	  driver.findElement(By.id("tabButton")).click();
	  Thread.sleep(2000);
	  System.out.println("2. The title of webpage is ....."+driver.getTitle());
	  
	  Set<String> handle = driver.getWindowHandles();
	  System.out.println("The No. of windows is :"+handle.size());
	  for (String child :handle) {
		  System.out.println("Window handle..."+child);
		  if(!child.equalsIgnoreCase(parentwin)) {
			  driver.switchTo().window(child);
			  Thread.sleep(2000);
			  String text = driver.findElement(By.id("sampleHeading")).getText();
			  System.out.println("The text in new window is "+text);
		  }
	  }
	  driver.close();
	  
	  driver.switchTo().window(parentwin);
	  driver.findElement(By.id("windowButton")).click();
	  
	  Set<String> popwin = driver.getWindowHandles();
	  System.out.println("The No. of windows is :"+handle.size());
	  for (String child :popwin) {
		  System.out.println("Window handle..."+child);
		  if(!child.equalsIgnoreCase(parentwin)) {
			  driver.switchTo().window(child);
			  Thread.sleep(2000);
			  String text = driver.findElement(By.id("sampleHeading")).getText();
			  System.out.println("The text in new pop up window is "+text);
		  }
	  }
	  driver.close();
	  driver.switchTo().window(parentwin);
	  
	  driver.switchTo().newWindow(WindowType.WINDOW);			// this automatically switches focus into new window
	  driver.get("https://the-internet.herokuapp.com/");
	  Thread.sleep(2000);
	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.lambdatest.com/blog/");
	  
	  driver.quit();
	  
	  
  }
}
