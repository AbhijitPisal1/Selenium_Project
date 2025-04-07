package GridTestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoteWebSampleTest {
	
	WebDriver driver;
	
  @Test
  public void search() throws MalformedURLException{
	  
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
//	  options.setCapability(CapabilityType.BROWSER_VERSION, "120");
	  
	  String strHUb = "http://10.0.12.2:4444";
	  
	  driver = new RemoteWebDriver(new URL(strHUb), options);
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  
	  driver.get("https://danube-webshop.herokuapp.com/");
	  driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	  
	  String strURL =driver.getCurrentUrl();
	  Assert.assertTrue(strURL.contains("novel"));
  
	  driver.quit();
  }
  
}



/**
 * To check local host IP for standalone use this in cmd 
 * java -jar selenium-server-4.31.0.jar standalone --selenium-manager true
 * 
 * for hub and node, initiate hub using cmd command
 * java -jar selenium-server-4.31.0.jar hub
 * 
 * then create note by running command in new cmd session
 * java -jar selenium-server-4.31.0.jar node --selenium-manager true
 */

