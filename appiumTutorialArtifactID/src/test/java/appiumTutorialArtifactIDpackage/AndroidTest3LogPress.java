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

public class AndroidTest3LogPress {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			
			
			  driver.findElement(AppiumBy.accessibilityId("Views")).click();
			//  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

			 
			  driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
			 
			  
			 driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
			 
			 RemoteWebElement element =   (RemoteWebElement) driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().text(\"People Names\")"));

			  HashMap<String, String> attr = new HashMap<String, String>();
			  attr.put("elementId", element.getId());
			  attr.put("duration", "5000");

			  
			  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", attr);
			  
			 
			    //el.click();
				Thread.sleep(3000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			}
		
	}

}
