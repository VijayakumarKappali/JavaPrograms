package appiumTutorialArtifactIDpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTest_Scroll {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		caps.setCapability("appium:skipServerInstallation", true);
		caps.setCapability("appium:noReset", true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			
			
			  driver.findElement(AppiumBy.accessibilityId("Views")).click();
			//  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

			 
			 // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
			 // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollToEnd(1);"));
		//	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).flingToEnd(2);"));
			  Thread.sleep(2000);
			  
				/*
				 * boolean canScrollMore = false; do { canScrollMore = (Boolean)
				 * ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
				 * ImmutableMap.of("left", 100, "top", 300, "width", 500, "height", 500,
				 * "direction", "down", "percent", 1.0)); } while (canScrollMore);
				 */
				 
			  
			  
			  
			  
			  
				
				/*
				 * RemoteWebElement element = (RemoteWebElement) driver .findElement(AppiumBy.
				 * androidUIAutomator("new UiSelector().resourceId(\"android:id/list\")"));
				 * 
				 * 
				 * 
				 * boolean canScrollMore = (Boolean) ((JavascriptExecutor)
				 * driver).executeScript("mobile: scrollGesture", ImmutableMap.of("elementId",
				 * element.getId(), "direction", "down", "percent", 1, "speed", 10000));
				 * 
				 * WebElement source = driver.findElement(By.id("SomeAccessibilityID"));
				 * WebElement target = driver.findElement(By.id("target")); Point sourcer =
				 * source.getLocation(); Point targett = target.getLocation(); PointerInput
				 * finger = new PointerInput(PointerInput.Kind.TOUCH, "finger"); Sequence
				 * dragNDrop = new Sequence(finger, 1);
				 * 
				 * dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0),
				 * PointerInput.Origin.viewport(), sourcer.x, sourcer.y));
				 * dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.
				 * asArg()));
				 * dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(700),
				 * PointerInput.Origin.viewport(),targett.x, targett.y));
				 * dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.
				 * asArg())); driver.perform(Arrays.asList(dragNDrop));
				 */
				 
				
				/*
				 * boolean canScrollMore = (Boolean) ((JavascriptExecutor)
				 * driver).executeScript("mobile: flingGesture", ImmutableMap.of("elementId",
				 * element.getId(), "direction", "down", "speed", 10000));
				 */
				 

			
				Thread.sleep(3000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			    System.out.println("end");
			}
		
	}

}
