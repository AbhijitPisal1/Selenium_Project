package testScripts;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class EndToEndTesting {

    WebDriver driver;

    @BeforeClass
    public void launch() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }

    @Test
    public void endToEnd() throws InterruptedException {
        driver.get("https://www.spicejet.com/");

        // Click on the origin field
        driver.findElement(By.cssSelector(".css-1cwyjr8")).click();
        Thread.sleep(1000);

        // Select origin
        driver.findElement(By.xpath("//div[text()='CJB']")).click();
        Thread.sleep(1000);

        // Select destination
        driver.findElement(By.xpath("//div[text()='MAA']")).click();

        // Select current date in calendar
        driver.findElement(By.cssSelector(".css-ldjbj4n")).click();

        // Check if return date calendar is disabled
        WebElement toDate = driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']"));
        String styleValue = toDate.getDomAttribute("style");

        System.out.println("The value in the selected attribute: " + styleValue);

        if (styleValue.contains("background-color: rgb(238, 238, 238)")) {
            System.out.println("The 'To Date' calendar is not enabled.");
            Assert.assertFalse(false);
        } else {
            System.out.println("The 'To Date' calendar is enabled.");
            Assert.assertFalse(true);
        }

        // Select passengers
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
        int i = 1;
        while (i < 3) {  // Selecting 3 adults
            driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
            i++;
        }

        Thread.sleep(2000);

        // Confirm passenger selection
        driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();

        // Select "Family & Friends" fare
        driver.findElement(By.xpath("//div[text()='Family & Friends']")).click();

        // Click search flights
        driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();

        System.out.println("We successfully clicked the search flight.");

        driver.quit();
    }
}
