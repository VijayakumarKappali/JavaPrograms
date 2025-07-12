package appiumTutorialArtifactIDpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTestSwipe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		caps.setCapability("appium:noReset", true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			
			
		//	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
			//  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

			 
		//	  driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
			 
			  
		//	 driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
			 
			 //RemoteWebElement element =   (RemoteWebElement) driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"io.appium.android.apis:id/gallery\")"));

			 RemoteWebElement PHOTOelement =   (RemoteWebElement) driver.findElement(AppiumBy.className("android.widget.ImageView"));

			  HashMap<String, String> attr = new HashMap<String, String>();
			  attr.put("elementId", PHOTOelement.getId());
			  attr.put("direction", "left");
			  attr.put("percent", "1");

			  Thread.sleep(3000);
			  ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", attr);
			  
			//  boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",ImmutableMap.of("elementId", PHOTOelement.getId(), "direction", "right", "percent", 5));
			
			  
			 
			    //el.click();
				Thread.sleep(3000);
			    driver.getPageSource();
			} catch (Exception e) {
				System.out.println(e);
			}
		finally {
				
			    driver.quit();
			   // builder.stop();
			}
		
	}

}
