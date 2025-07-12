package appiumTutorialArtifactIDpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidTest_launchByActivity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
		
		try {
			Activity activity = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.FragmentPreferences");
			
			
			  HashMap<String, String> attr = new HashMap<String, String>();
			  attr.put("intent", "io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences");
			 // attr.put("duration", "5000");	
			  
			  ((JavascriptExecutor) driver).executeScript("mobile: startActivity", attr);

			    //el.click();
				Thread.sleep(5000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			}
	}

}
