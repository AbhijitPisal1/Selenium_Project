package testScripts;

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
	  
	  String strHUb = "";
	  
	  driver = new RemoteWebDriver(new URL(strHUb), options);
	  
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
	  
	  String strURL =driver.getCurrentUrl();
	  Assert.assertTrue(strURL.contains("novel"));
  }
}
