package appiumTutorialArtifactIDpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AndroidTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		
		/*
		 * AppiumDriverLocalService builder = new AppiumServiceBuilder()
		 * .withAppiumJS(new
		 * File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress(
		 * "0.0.0.0").usingPort(4723).build();
		 * 
		 * builder.start();
		 */
		 
		
		
		UiAutomator2Options options = new UiAutomator2Options();
		//options.setUdid("adb-2b21438c-iUPCq8._adb-tls-connect._tcp.");
		options.setApp("/Users/vkappali/Downloads/ApiDemos-debug.apk");
		
		//options.setFullReset(false);
		
		//options.setNoReset(true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
			try {
				
				
			  driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			//  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

			  Thread.sleep(2000);
			  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
			  driver.findElement(AppiumBy.id("android:id/checkbox")).click();
			 
			    //el.click();
				Thread.sleep(5000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			}

	}

}
