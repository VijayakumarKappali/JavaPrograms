package appiumTutorialArtifactIDpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTest2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
		
		try {
			
			
			  driver.findElement(AppiumBy.accessibilityId("Preference")).click();
			//  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

			  Thread.sleep(2000);
			  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
			  driver.findElement(AppiumBy.id("android:id/checkbox")).click();
			  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
			  driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("hello");
			  driver.findElement(AppiumBy.id("android:id/button1")).click();


			    //el.click();
				Thread.sleep(5000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			}
		
	}

}
