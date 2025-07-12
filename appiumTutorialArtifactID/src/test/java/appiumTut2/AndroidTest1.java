package appiumTut2;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v122.indexeddb.model.Key;
import org.openqa.selenium.devtools.v122.indexeddb.model.Key.Type;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.HidesKeyboard;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;

public class AndroidTest1 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("appium:app", "C:\\Users\\Vijay\\Documents\\Practice\\appium2.0\\APKFiles\\resources\\ApiDemos-debug.apk");
		caps.setCapability("appium:automationName", "uiautomator2");
		
		//caps.setCapability("appium:appActivity", "io.appium.android.apis.preference.FragmentPreferences");
		
		caps.setCapability("appium:noReset", true);
		
		//caps.setCapability("appium:fullReset", true);
		
		//browser automation
		//caps.setCapability("appium:chromedriverExecutable", "/Users/vkappali/Downloads/chromedriver-mac-x64");
		//caps.setCapability("browserName", "chrome");

		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), caps);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		/*
		 * driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		 * 
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\").index(4)"
		 * )).click();
		 * 
		 * driver.findElement(AppiumBy.xpath(
		 * "(//android.widget.CheckBox[@resource-id='android:id/checkbox'])[1]")).click(
		 * );
		 * 
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().text(\"Edit text preference\")")).click(
		 * );
		 * 
		 * driver.findElement(AppiumBy.id("android:id/edit")).sendKeys("ABCD");
		 */
		  
		  
		  
		//  ((PressesKey)driver).pressKey(new KeyEvent(AndroidKey.BACK));
		  
		 // ((HidesKeyboard)driver).hideKeyboard();
		  
		 // ((JavascriptExecutor) driver).executeScript("mobile: hideKeyboard");
		  
		  
		//  driver.executeScript("mobile: hideKeyboard");
		  
		  
		  
		  
			/*
			 * ((InteractsWithApps)driver).runAppInBackground(Duration.ofSeconds(5));
			 * 
			 * Thread.sleep(3000);
			 * 
			 * ((InteractsWithApps)driver).terminateApp("io.appium.android.apis");
			 * 
			 * Thread.sleep(3000);
			 * 
			 * ((InteractsWithApps)driver).activateApp("io.appium.android.apis");
			 */
		 
		
		
		// ALERT Handling
		
			/*
			 * driver.findElement(AppiumBy.
			 * androidUIAutomator("new UiSelector().text(\"App\")")).click( );
			 * 
			 * driver.findElement(AppiumBy.
			 * androidUIAutomator("new UiSelector().text(\"Alert Dialogs\")")).click( );
			 * 
			 * driver.findElement(AppiumBy.
			 * androidUIAutomator("new UiSelector().textContains(\"with a message\")")).
			 * click( ); Thread.sleep(3000);
			 * 
			 * System.out.println( driver.switchTo().alert().getText());
			 */
		// driver.switchTo().alert().accept();
		// driver.executeScript("mobile: acceptAlert");
		 
		// driver.switchTo().alert().dismiss();
		// driver.executeScript("mobile: dismissAlert");
		
		//HashMap<String, Integer> battInfo = (HashMap<String, Integer>) driver.executeScript("mobile: batteryInfo");
		//System.out.println(battInfo);
		
		//HashMap<String, Integer> deviceInfo = (HashMap<String, Integer>) driver.executeScript("mobile: deviceInfo");
		//System.out.println(deviceInfo);
		
		//HashMap<String, Integer> deviceInfo = (HashMap<String, Integer>) driver.executeScript("mobile: getDeviceTime");
		//System.out.println(deviceInfo);
		
		
		// SET PERMISSIONS 
	//	HashMap<String, String> ss = new HashMap<>();
	//	ss.put("permissions", "android.permission.READ_CONTACTS");
	//	ss.put("appPackage", "io.appium.android.apis");
		//ss.put("action", "revoke");
		
		
		//((JavascriptExecutor) driver).executeScript("mobile: changePermissions",ss);
		
		// driver.executeScript("mobile: changePermissions",ss);
		

		// GET PERMISSIONS
		/*
		 * HashMap<String, String> ss2 = new HashMap<>(); ss2.put("type", "granted");
		 * ss2.put("appPackage", "io.appium.android.apis"); ArrayList<String>
		 * getpermissions = (ArrayList<String>)
		 * driver.executeScript("mobile: getPermissions",ss2);
		 * System.out.println(getpermissions);
		 */
		 
		
		
		
		/*
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().text(\"App\")")).click( );
		 * 
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().text(\"Search\")")).click( );
		 * 
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().textContains(\"Invoke Search\")")).
		 * click( );
		 */
		  
		
		
		/*
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().textContains(\"onSearch\")")). click( );
		 * 
		 * driver.findElement(AppiumBy.
		 * androidUIAutomator("new UiSelector().resourceId(\"android:id/search_src_text\")"
		 * )).sendKeys("wwww") ;
		 * 
		 * HashMap<String, String> ss = new HashMap<>(); ss.put("action", "go");
		 * driver.executeScript("mobile: performEditorAction",ss);
		 */
		
		
	//	 driver.executeScript("mobile: openNotifications");
		  
		  
		  
	/*
	 * LinkedHashMap<String,Object> listSms = (LinkedHashMap<String, Object>)
	 * driver.executeScript("mobile: listSms"); System.out.println(listSms);
	 */
		 
		
		
	/*
	 * driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiSelector().textContains(\"onSearch\")")). click( );
	 * 
	 * driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiSelector().resourceId(\"android:id/search_src_text\")"
	 * )).click() ;
	 * 
	 * HashMap<String, String> ss = new HashMap<>(); ss.put("text",
	 * "real keyboard typing"); driver.executeScript("mobile: type",ss);
	 */
		 
		
	/*
	 * HashMap<String, String> ss = new HashMap<>(); ss.put("remotePath",
	 * "/storage/emulated/0/Download/sample3.txt"); String fileTxtx=(String)
	 * driver.executeScript("mobile: pullFile",ss); System.out.println(new
	 * String(Base64.getDecoder().decode(fileTxtx.getBytes())));
	 */
	
		
		
		
	/*
	 * boolean isAppInstalled = (boolean)
	 * driver.executeScript("mobile: isAppInstalled",Map.of("appId",
	 * "io.appium.android.apis")); System.out.println(isAppInstalled);
	 * 
	 * long queryState = (long)
	 * driver.executeScript("mobile: queryAppState",Map.of("appId",
	 * "io.appium.android.apis")); System.out.println(queryState);
	 * 
	 * boolean isAppTerminated = (boolean)
	 * driver.executeScript("mobile: terminateApp",Map.of("appId",
	 * "io.appium.android.apis")); System.out.println(isAppTerminated);
	 * 
	 * long queryState2 = (long)
	 * driver.executeScript("mobile: queryAppState",Map.of("appId",
	 * "io.appium.android.apis")); System.out.println(queryState2);
	 * 
	 * Thread.sleep(3000);
	 * driver.executeScript("mobile: activateApp",Map.of("appId",
	 * "io.appium.android.apis")); long queryState3 = (long)
	 * driver.executeScript("mobile: queryAppState",Map.of("appId",
	 * "io.appium.android.apis")); System.out.println(queryState3);
	 */
		
		
	/*
	 * boolean isRemoved = (boolean)
	 * driver.executeScript("mobile: removeApp",Map.of("appId",
	 * "io.appium.android.apis")); System.out.println(isRemoved);
	 * 
	 * Thread.sleep(3000);
	 * driver.executeScript("mobile: installApp",Map.of("appPath",
	 * "/Users/vkappali/Downloads/ApiDemos-debug.apk"));
	 */
		 
		
		
	/*
	 * Thread.sleep(3000);
	 * 
	 * driver.executeScript("mobile: startActivity",Map.of( "intent",
	 * "io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences"
	 * ,"windowingMode",2));
	 */
		
		
	/*
	 * Thread.sleep(3000);
	 * 
	 * driver.executeScript("mobile: startActivity",Map.of( "intent",
	 * "io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences"
	 * ,"windowingMode",0));
	 */
		
		
	/*
	 * Thread.sleep(3000);
	 * 
	 * driver.executeScript("mobile: startActivity", Map.of("intent",
	 * "io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences",
	 * "windowingMode", 1));
	 */
		  
		  
			
	/*
	 * Thread.sleep(3000);
	 * 
	 * driver.executeScript("mobile: startActivity", Map.of("intent",
	 * "io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences",
	 * "windowingMode", 5));
	 */
		 
	/*
	 * Thread.sleep(3000);
	 * 
	 * driver.executeScript("mobile: startActivity", Map.of("intent",
	 * "io.appium.android.apis/io.appium.android.apis.preference.FragmentPreferences",
	 * "windowingMode", 6));
	 */
				 
		
		
	/*
	 * driver.get("https://enlighten.enphaseenergy.com/mobile/");
	 * 
	 * driver.findElement(By.id("email")).sendKeys("homeowner20220@gmail.com");
	 * driver.findElement(By.id("password")).sendKeys("Test@1234");
	 * 
	 * driver.findElement(By.id("loginButton")).click();
	 */
		
		
	/*
	 * driver.executeScript("mobile: lock", Map.of("seconds", 10));
	 * Thread.sleep(3000);
	 * 
	 * System.out.println(driver.executeScript("mobile: isLocked"));
	 * Thread.sleep(3000); driver.executeScript("mobile: unlock");
	 */
	
		
		
	/*
	 * driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiSelector().textContains(\"onSearch\")")).click();
	 * 
	 * driver.findElement(AppiumBy.
	 * androidUIAutomator("new UiSelector().resourceId(\"android:id/search_src_text\")"
	 * )) .click();
	 * 
	 * HashMap<String, String> ss = new HashMap<>(); ss.put("text",
	 * "real keyboard typing"); driver.executeScript("mobile: type", ss);
	 * Thread.sleep(3000); RemoteWebElement element = (RemoteWebElement) driver
	 * .findElement(AppiumBy.
	 * androidUIAutomator("new UiSelector().resourceId(\"android:id/search_src_text\")"
	 * )); System.out.println( element.getId()); HashMap<String, String> ss2 = new
	 * HashMap<>(); ss2.put("elementId", element.getId()); ss2.put("text",
	 * "repldsxwcceecec text"); driver.executeScript("mobile: replaceElementValue",
	 * ss2);
	 */
		  
		  
	
	
	 
		
	
		//System.out.println("Test started");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		System.out.println("");
		
		System.out.println("Test Ended");

	}

}
