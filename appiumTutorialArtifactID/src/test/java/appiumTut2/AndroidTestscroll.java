package appiumTut2;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.devtools.v122.indexeddb.model.Key;
import org.openqa.selenium.devtools.v122.indexeddb.model.Key.Type;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class AndroidTestscroll {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		
		//caps.setCapability("appium:noReset", false);
		
		//caps.setCapability("appium:fullReset", true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").index(4)")).click();
		
		driver.findElement(AppiumBy.xpath("(//android.widget.CheckBox[@resource-id='android:id/checkbox'])[1]")).click();

		driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"Edit text preference\")")).click();
		
		driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("ABCD");
		
		((PressesKey)driver).pressKey(new KeyEvent(AndroidKey.BACK));
		
		//((InteractsWithApps)driver).runAppInBackground(Duration.ofSeconds(5));
		driver.runAppInBackground(Duration.ofSeconds(5));
		
		Thread.sleep(3000);
		
		driver.terminateApp("io.appium.android.apis");
		
		Thread.sleep(3000);
		
		driver.activateApp("io.appium.android.apis");
		
		
		
		
		System.out.println("Test started");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("");
		
		System.out.println("Test Ended");

	}

}
