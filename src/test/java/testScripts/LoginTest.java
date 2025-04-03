package testScripts;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class LoginTest {
	
	WebDriver driver;
	Properties prop;
	
	@BeforeMethod
	public void setup() throws IOException {
		prop = new Properties();
		String path = System.getProperty("user.dir")+"//src//test//resources//ConfigFiles//config.properties";
		FileInputStream fileIn = new FileInputStream(path);
		prop.load(fileIn);
		String strbrowser = prop.getProperty("browser");
		if (strbrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (strbrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize(); 
	}
	
	
	@Test(dataProvider = "LoginData")
  public void validLogin(String strUser, String strPwd) {
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("username")).sendKeys(strUser);
		driver.findElement(By.name("password")).sendKeys(strPwd);
		driver.findElement(By.cssSelector("i.fa.fa-2x.fa-sign-in")).click();
		boolean isValid = driver.findElement(By.cssSelector("div.flash.success")).isDisplayed();
		Assert.assertTrue(isValid);
//		driver.quit();
  	}
	
	@DataProvider(name="LoginData")
	public Object[][] getData() throws CsvValidationException, IOException{
		String path = System.getProperty("user.dir")+"//src//test//resources//TestData//LoginData.csv";
		CSVReader reader = new CSVReader(new FileReader(path));
		String cols[];
		ArrayList<Object> dataList = new ArrayList<Object>();
		while((cols = reader.readNext())!= null) {
			Object record[] = { cols[0], cols[1] };
			dataList.add(record);
		}
		reader.close();
		return dataList.toArray(new Object[dataList.size()][]);
	}
}
