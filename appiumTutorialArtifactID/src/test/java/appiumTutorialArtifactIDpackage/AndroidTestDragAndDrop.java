package appiumTutorialArtifactIDpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidTestDragAndDrop {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "/Users/vkappali/Downloads/ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		caps.setCapability("appium:noReset", true);
		
		AndroidDriver driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), caps);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		try {
			
			
			  driver.findElement(AppiumBy.accessibilityId("Views")).click();
			//  driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

			 
			  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
			 
			  
			  RemoteWebElement Sourceelement = (RemoteWebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));
			 

			 RemoteWebElement destinatinelement =   (RemoteWebElement) driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_2"));
			 
			  Rectangle rectang =  destinatinelement.getRect();
			  
			  int x = rectang.x + rectang.width/2;
			  int y =  rectang.y + rectang.height/2;

			  
			  ((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
					    "elementId", ((RemoteWebElement) Sourceelement).getId(),
					  ///  "endX", 623,
					 //   "endY", 556));
					    
					    "endX", x,
					    "endY", y));
			  
			 
			    //el.click();
				Thread.sleep(3000);
			    driver.getPageSource();
			} finally {
				
			    driver.quit();
			   // builder.stop();
			}
		
	}

}
