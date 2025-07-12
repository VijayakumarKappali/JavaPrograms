package com.practice.ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class simulatorScripts {
	static AppiumDriver driver=null;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		String uicatAppPath = "/Users/vkappali/Library/Developer/Xcode/DerivedData/UIKitCatalog-dxavjwvhfhoozvcdkefdbxaqefkd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app";
		String sauceAppPath = "/Users/vkappali/Downloads/MyRNDemoApp.app";
		
		String ENHOAppPath = "/Users/vkappali/Documents/4.0StoreBuilds/Enlighten/Enlighten.ipa";
		
		// Simulator
		/*
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setCapability("appium:app",
		 * "/Users/vkappali/Library/Developer/Xcode/DerivedData/UIKitCatalog-dxavjwvhfhoozvcdkefdbxaqefkd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app"
		 * ); caps.setCapability("appium:automationName", "xcuitest");
		 * caps.setCapability("appium:deviceName", "iPhone 15");
		 * caps.setCapability("appium:platformVersion", "17.4");
		 */
		
		//Simulator
		/*
		 * XCUITestOptions xcui = new XCUITestOptions();
		 * xcui.setDeviceName("iPhone 15"); xcui.setPlatformVersion("17.4");
		 * xcui.setApp(uicatAppPath); xcui.noReset(); driver = new IOSDriver(new
		 * URL("http://0.0.0.0:4723/"), xcui);
		 */
		
		XCUITestOptions xcui = new XCUITestOptions();
		xcui.setUdid("00008101-000D48A43CBA001E");
		xcui.setApp(ENHOAppPath);
		xcui.noReset();
		driver = new IOSDriver(new URL("http://0.0.0.0:4723/"), xcui);
		
		
		
		
		
		
		
		
		
		driver.executeScript("mobile:launchApp", Map.of(
			    "bundleId", "com.apple.mobileslideshow"
			));
		
		
		driver.findElement(AppiumBy.xpath("//XCUIElementTypeCell")).click();
		driver.executeScript("mobile: swipe", ImmutableMap.of(
			    "velocity", 2500,
			    "direction", "left"
			));
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Ended------");
		
		driver.quit();

	}
	
	public static void sendKeys() {
		driver.findElement(AppiumBy.accessibilityId("Alert Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Text Entry")).click();
		
		driver.findElement(AppiumBy.iOSNsPredicateString("type == \"XCUIElementTypeTextField\"")).sendKeys("sdcddcdc");
		
		
		driver.findElement(AppiumBy.accessibilityId("OK")).click();
	}
	
	public static void longPress() {
driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
		
		RemoteWebElement e = (RemoteWebElement) driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`name == \"Increment\"`][3]"));
		driver.executeScript("mobile: touchAndHold", ImmutableMap.of(
		    "elementId", e.getId(),
		    "duration", 5
		));
	}
	
	public static void simpleScroll() {
		//may be this is not right
		RemoteWebElement e = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Web View"));
		driver.executeScript("mobile: scroll", ImmutableMap.of(
		    "elementId", e.getId(),
		    "direction", "down"
		));
		
		
		 driver.findElement(AppiumBy.accessibilityId("Web View")).click();
	}
	
	public static void scrollTillEleVisi() {
		RemoteWebElement e = (RemoteWebElement) driver.findElement(AppiumBy.xpath("//XCUIElementTypeOther"));
		driver.executeScript("mobile: scroll", ImmutableMap.of(
		    "elementId", e.getId(),
		    "direction", "down",
		    "name", "assets/src/assets/images/twitter.png",
		    "toVisible", true
		));
	}
	
	public static void scrollWholepage() {
		driver.executeScript("mobile: scroll", ImmutableMap.of(
		   
		    "direction", "down"
		  
		));
	}
	
	
	public static void setPickerWheelValueBySendKeys() {
		//XCUIElementTypePickerWheel
 driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		 
		 driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("150");
		 
		 
		 driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("75");
		 
		 
		 driver.findElement(AppiumBy.accessibilityId("Blue color component value")).sendKeys("75");
	}
	
	public static void setPickerWheelValueByGestures() {
		// Not working
		//XCUIElementTypePickerWheel

		 driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
		 
			RemoteWebElement e = (RemoteWebElement) driver.findElement(AppiumBy.accessibilityId("Red color component value"));

	
			  driver.findElement(AppiumBy.accessibilityId("Picker View"));
			  
			  driver.executeScript("mobile: selectPickerWheelValue", ImmutableMap.of(
			 "elementId", e.getId(),
			 "value", 165,
			 "maxAttempts", 10,
			  "order", "next"
			  ));
			 
	}
	
	
	public static void setSliderValue() {
		
		//XCUIElementTypeSlider
		
		driver.findElement(AppiumBy.xpath("(//XCUIElementTypeSlider)[2]")).sendKeys("0.9"); //value should be 0 to 1 
		 
		 System.out.println( driver.findElement(AppiumBy.xpath("(//XCUIElementTypeSlider)[2]")).getText());
			 
	}

}
