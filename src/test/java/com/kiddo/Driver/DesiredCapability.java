package com.kiddo.Driver;

/**
 * @author Gopinath Angusamy
 * created on 20/12/22
 */

import static com.kiddo.Util.SetProperties.appConfig;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.kiddo.Pages.AddChildPages;
import com.kiddo.Pages.CreateAccountPages;
import com.kiddo.Pages.iOS.AddChildPagesiOS;
import com.kiddo.Pages.iOS.CreateAccountPagesiOS;
import com.kiddo.Util.SetProperties;
import io.appium.java_client.android.AndroidDriver;


public class DesiredCapability {

	public static AndroidDriver<WebElement> driver;
	protected static int explicitWaitInSeconds;
	public static WebDriverWait wait;
	public static WebDriverWait trywait;
	public static WebDriverWait longWait;
	SetProperties setProperty = new SetProperties();
	public static String udid;
	public static String androidVersion;

	

	public void SetDesiredCapabilities() throws IOException, InterruptedException {

		if (appConfig.getValue("Platform").equalsIgnoreCase("Android")) {
			final DesiredCapabilities capabilities = new DesiredCapabilities();

			capabilities.setCapability("appium:udid", appConfig.getValue("udid"));
			capabilities.setCapability("appium:platformVersion",appConfig.getValue("androidVersion"));
			capabilities.setCapability("appium:automationName", appConfig.getValue("automationName"));
			capabilities.setCapability("platformName",appConfig.getValue("Platform") );
			capabilities.setCapability("appium:appPackage",appConfig.getValue("appPackage") );
			capabilities.setCapability("appium:appActivity", appConfig.getValue("appActivity"));
			capabilities.setCapability("appium:skipUnlock", "true");
			capabilities.setCapability("appium:noReset", "true");
			capabilities.setCapability("instrumentApp", true);
			capabilities.setCapability("newCommandTimeout", 600);
			capabilities.setCapability("autoAcceptAlerts", true);
			capabilities.setCapability("autoGrantPermissions", true);
			capabilities.setCapability("clearDeviceLogsOnStart", true);
			capabilities.setCapability("newCommandTimeout", "600");
			capabilities.setCapability("waitForIdleTimeout", 0);
			capabilities.setCapability("unicodeKeyboard", false);
			capabilities.setCapability("resetKeyboard", false);
		
			
			/**
			 * Starting the Appium Desktop on IP :127.0.0.1 and Port : 4725
			 */

			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4725/wd/hub"), capabilities);
			wait = new WebDriverWait(driver, 40);
			trywait = new WebDriverWait(driver, 15);
			longWait = new WebDriverWait(driver, 50);

			PageFactory.initElements(driver, CreateAccountPages.class);
			
			PageFactory.initElements(driver, AddChildPages.class);
		
			
			
		} else if (appConfig.getValue("Platform").equalsIgnoreCase("iOS")) {
			final DesiredCapabilities cap = new DesiredCapabilities();
			 cap.setCapability("platformName", appConfig.getValue("udid"));
			  cap.setCapability("deviceName", "iPhone 14");
			  cap.setCapability("udid", "give your devices id");
			  cap.setCapability("appium:skipUnlock", "true");
			  cap.setCapability("appium:noReset", "true");
			  cap.setCapability("instrumentApp", true);
			  cap.setCapability("newCommandTimeout", 600);
			  cap.setCapability("autoAcceptAlerts", true);
			  cap.setCapability("autoGrantPermissions", true);
			  cap.setCapability("clearDeviceLogsOnStart", true);
			  cap.setCapability("newCommandTimeout", "600");
			  cap.setCapability("waitForIdleTimeout", 0);
			  cap.setCapability("unicodeKeyboard", false);
			  cap.setCapability("resetKeyboard", false);
			  cap.setCapability("automationName", "XCUITest");
			  cap.setCapability("app", "/Users/gopiangu/Downloads/K_20_01_23.ipa");
			
			driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4725/wd/hub"), cap);
			wait = new WebDriverWait(driver, 40);
			trywait = new WebDriverWait(driver, 15);
			longWait = new WebDriverWait(driver, 50);

			PageFactory.initElements(driver, CreateAccountPagesiOS.class);
			PageFactory.initElements(driver, AddChildPagesiOS.class);
	
			
			
			
		}
	}

}
