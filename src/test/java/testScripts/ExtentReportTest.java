package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class ExtentReportTest {
	WebDriver driver;
	/**
	 * Create the objects for classes ExtentSparkReporter, ExtentReports, and
	 * ExtentTest classes. The ExtentReports class generates HTML reports based on
	 * the path provided in the ExtentSparkReporter class. ExtentReports uses this
	 * path by mapping itself to the ExtentSparkReporter object using the
	 * attachReporter() method. This is used to create an HTML file and accepts a
	 * file path to the directory where the output should be saved. The ExtentTest
	 * class logs the test steps in the HTML file to generate a detailed report. The
	 * ExtentReports and ExtentTest classes are used with built-in methods.
	 */
	ExtentReports extentReports;
	ExtentSparkReporter spark;
	ExtentTest extentTest;

	@BeforeTest
	public void setupExtent() {
//		Initialize the extentSparkReporter object by passing the location for the generated HTML report.
		extentReports = new ExtentReports();
		spark = new ExtentSparkReporter("test-output/SparkReport.html").viewConfigurer().viewOrder().as(
				new ViewName[] { ViewName.DASHBOARD, ViewName.TEST, ViewName.AUTHOR, ViewName.DEVICE, ViewName.LOG })
				.apply();
//		Initialize the extentReports object and attach the extentSparkReporter with it.
		extentReports.attachReporter(spark);
	}

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://danube-webshop.herokuapp.com/");
	}

	@Test
	public void crimeNovelSearch() {
		extentTest = extentReports.createTest("Crime & Thrillers");
		driver.findElement(By.xpath("//a[contains(text(),'Crime & Thrillers')]")).click();
		String strURL = driver.getCurrentUrl();
		Assert.assertTrue(strURL.contains("crime"));
	}

	@Test
	public void StoriesSearch() {
		extentTest = extentReports.createTest("Novels & Stories");
		driver.findElement(By.xpath("//a[contains(text(),'Novels & Stories')]")).click();
		String strURL = driver.getCurrentUrl();
		Assert.assertTrue(strURL.contains("novel stories")); // this will fail for novel stories
	}

	@AfterMethod
	public void teardown(ITestResult result) {
		extentTest.assignAuthor("AutomationTester1").assignCategory("Regression")
				.assignDevice(System.getProperty("os.name")).assignDevice(System.getProperty("os.version"));
		if (ITestResult.FAILURE == result.getStatus()) {
//			extentTest.log(Status.FAIL, result.getThrowable().getMessage());	// single line message
			extentTest.log(Status.FAIL, result.getThrowable()); // entire error message
			String path = Utility.getScreenshotPath(driver);
			extentTest.addScreenCaptureFromPath(path);
		}
		driver.close();
	}

	@AfterTest
	public void extentTeardown() {
		extentReports.flush();

		/**
		 * end method to get all the outputs into file Calling the flush method
		 * writes/updates the test information of the reporter to the destination type.
		 * otherwise no reports will be generated. Also, It Erases any previous data on
		 * a relevant report and creates a whole new report
		 */
	}
}
