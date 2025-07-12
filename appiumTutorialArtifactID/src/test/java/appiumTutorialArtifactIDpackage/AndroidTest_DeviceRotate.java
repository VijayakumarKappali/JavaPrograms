package appiumTutorialArtifactIDpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidTest_DeviceRotate {

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
			 
			//  DeviceRotation deviceRoate = new DeviceRotation(0, 0, 90);
			//  driver.rotate(deviceRoate);
			//  Thread.sleep(3000);
			  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
			 
			  driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("hello");
			  Thread.sleep(2000);
			  driver.findElement(AppiumBy.id("android:id/button1")).click();
			  Thread.sleep(2000);
			  
			  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"WiFi settings\")")).click();
			  driver.setClipboardText("Vijay");
			  String textTobepatest = driver.getClipboardText();
			  System.out.println(textTobepatest);
			//  driver.findElement(AppiumBy.id("android:id/edit")).click();
			  Thread.sleep(2000);
			  
			  driver.findElement(AppiumBy.id("android:id/edit")).sendKeys(textTobepatest);
			  
			  Thread.sleep(2000);
			  
			  driver.pressKey(new KeyEvent(AndroidKey.Z));
			  driver.pressKey(new KeyEvent(AndroidKey.A));
			  driver.pressKey(new KeyEvent(AndroidKey.Z));
			  
			  driver.pressKey(new KeyEvent(AndroidKey.ENTER));
			  
			
			    //el.click();
				Thread.sleep(5000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			}
		
	}

}
