package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class XPathMethodsDemoTest {
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// open chrome browser
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();

		driver.get(
				"https://accounts.google.com/lifecycle/steps/signup/name?continue=https://myaccount.google.com?utm_source%3Daccount-marketing-page%26utm_medium%3Dgo-to-account-button%26gar%3DWzEzMywiMjM2NzM2Il0%26sl%3Dtrue&ddm=1&dsh=S-2046401214:1733298212691086&flowEntry=SignUp&flowName=GlifWebSignIn&ifkv=AcMMx-eiM9WOroI0sVD8Zz2BADIbijS1-EgsW4hddFp1yYEJh2N8nSh9Zen6uxiaikoUQgi428OQPg&service=accountsettings&TL=AKOx4s2Z0jgbV2y0zkMRiYG_VFqOPV8Pz0Hg2QYuuqdOzrHwQ_OPzuUDjn-SoGL0");
		;
// contains method
		// to locate the element whose attribute value contains partial value of
		// specified text anywhere in the value
		// format - // TagName[contains[@attributeName, 'partial Value']]

		driver.findElement(By.xpath("//input[contains[@aria-label,'name']")).sendKeys("Mark");

// Start-with method
		// to locate elements where attribute values will start with a specific fixed
		// text string
		driver.findElement(By.xpath("//input[contains[@aria-label,'First']")).sendKeys("ALex");

// text () method
		// display the element which has the exact text displayed on UI
		driver.findElement(By.xpath("//span[text ()='Next']")).click();

// XPath axes
		// child - locate child element from parent
		driver.findElement(By.xpath("//div[@class='VfPpkd-dgl2Hf-ppHlrf-sM5MNb']/child::button")).click();
// other axes are parent, preceding-sibling, following-sibling, ancestor and descendant
		// Example for parent Axe : //div[@class='VfPpkd-Jh9lGc']/parent::button
		// Example for following-sibling Axe : //input[@aria-label='Last name
		// (optional)']/following-sibling::div
		// Example for preceding-sibling Axe : //div[text ()='Last name
		// (optional)']/preceding-sibling::input
		// Example for descendant Axe : //div[@class='H2p7Gf']/descendant::input
		// Example for ancestor Axe :
		// //input[@id="firstName"]/ancestor::div[@class='H2p7Gf']

// AND OR methods
		// and - both attribute values details should match
		driver.findElement(By.xpath("//input[@type='text' and @id='firstName']")).sendKeys("anthony");
		// OR - either one of the attribute values details should match
		driver.findElement(By.xpath("//input[@name='firstName' or @id='firstName']")).sendKeys("anthony");

	}

}
