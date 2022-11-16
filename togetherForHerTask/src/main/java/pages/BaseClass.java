package pages;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	public static AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		DesiredCapabilities dc = new DesiredCapabilities();

		try {
//		dc.setCapability("platformName", "ANDROID");
			dc.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
			dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10 QKQ1.191008.001");
			dc.setCapability(MobileCapabilityType.DEVICE_NAME, "it's niks");
			dc.setCapability(MobileCapabilityType.UDID, "7da6ce54");
			dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
			dc.setCapability("appPackage", "com.avegen.together");
			dc.setCapability("appActivity", "com.avegen.together.MainActivity");

			URL url = new URL("http://127.0.0.1:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, dc);
		}

		catch (Exception e) {
			System.out.println("issue arrised while setting capabilities");
		}
	}

	
	@AfterTest
	public void tearDown() {

		driver.quit();
	}

}
