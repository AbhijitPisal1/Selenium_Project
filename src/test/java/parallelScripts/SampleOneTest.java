package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SampleOneTest {
	WebDriver driver;

	@Test
	public void testOne() {
		driver = new ChromeDriver();
		long id = Thread.currentThread().getId();
		System.out.println("Test11 in SampleOne..." + id);
	}

	@Test
	public void testTwo() {
		driver = new ChromeDriver();
		long id = Thread.currentThread().getId();
		System.out.println("Test12 in SampleTwo..." + id);
	}

	@Test
	public void testThree() {
		driver = new ChromeDriver();
		long id = Thread.currentThread().getId();
		System.out.println("Test13 in SampleOne..." + id);
	}

	@Test
	public void testFour() {
		driver = new ChromeDriver();
		long id = Thread.currentThread().getId();
		System.out.println("Test14 in SampleOne..." + id);
	}

//  @AfterMethod
	public void teardown() {
		driver.close();
	}

}
