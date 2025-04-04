package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * The Chrome DevTools Protocol (CDP) provides low-level access to Chrome's
 * internals, enabling deeper browser control, performance monitoring, and
 * network interception. When used with Selenium, it enhances capabilities like
 * capturing network logs, emulating network conditions, and enabling advanced
 * debugging. Selenium 4 supports CDP, and it can be integrated with TestNG to
 * enable more advanced testing and automation features.
 */
public class ChromeDevToolsTest {

	ChromeDriver driver; // specific chrome driver instance for chrome dev tools
	DevTools devTools;

	@BeforeMethod
	public void Setup() {
		driver = new ChromeDriver();

		devTools = driver.getDevTools();
		devTools.createSession(driver.getWindowHandle());
	}

	@Test
	public void devicemodeTest() {
		/**
		 * Refer to
		 * "https://chromedevtools.github.io/devtools-protocol/tot/Emulation/#method-setDeviceMetricsOverride"
		 * for API method details
		 */
		Map deviceMetrics = new HashMap() {
			{
				put("width", 800);
				put("height", 1100);
				put("deviceScaleFactor", 50);
				put("mobile", true);
			}
		};
		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
		driver.get("https://www.selenium.dev/");
	}

	@Test
	public void GeoLocationTest() {
		/**
		 * Refer to
		 * "https://chromedevtools.github.io/devtools-protocol/tot/Emulation/#method-setGeolocationOverride"
		 * for API method details
		 */
		Map deviceMetrics = new HashMap() {
			{
				put("latitude", 47.751076); // get latitude and longitude details form "https://www.latlong.net/"
				put("longitude", -120.740135);
				put("accuracy", 50);
			}
		};
		driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics);
		driver.get("https://oldnavy.gap.com/stores");
	}

}



/**
 * Here are few more examples of tasks that can be performed by integrating Chrome DevTools Protocol (CDP) with Selenium and TestNG:
1. Emulate Network Conditions:  Simulate slow or offline network conditions to test how your web application behaves under different network speeds.
	driver.executeCdpCommand("Network.emulateNetworkConditions", 
    	Map.of("offline", false, "latency", 100, "downloadThroughput", 500 * 1024, "uploadThroughput", 500 * 1024));

2. Intercept Network Requests: Capture network requests and responses to analyze API calls, track network errors, or validate request payloads.
	driver.executeCdpCommand("Network.enable", Map.of());
	driver.executeCdpCommand("Network.setRequestInterception", 
    	Map.of("patterns", List.of(Map.of("urlPattern", "*"))));
	Capture Performance Metrics:

3. Retrieve performance metrics like page load times, resource timings, and JavaScript execution timings.
	driver.executeCdpCommand("Performance.enable", Map.of());
	var performanceData = driver.executeCdpCommand("Performance.getMetrics", Map.of());
	System.out.println(performanceData);

4. Disable Browser Cache: Disable the cache to test how your app behaves when it’s forced to load resources from the network.
	driver.executeCdpCommand("Network.setCacheDisabled", Map.of("cacheDisabled", true));

5. Capture Console Logs: Capture logs from the browser's console to debug JavaScript issues or log custom messages.
	driver.executeCdpCommand("Runtime.enable", Map.of());
	driver.executeCdpCommand("Runtime.addBinding", Map.of("name", "console"));

6. Control Browser Window Size: Use CDP to change the browser window size or simulate different viewport sizes.
	driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", 
    	Map.of("width", 1920, "height", 1080, "deviceScaleFactor", 1, "mobile", false));
 */

