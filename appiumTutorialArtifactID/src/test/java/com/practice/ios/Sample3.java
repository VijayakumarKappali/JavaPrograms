package com.practice.ios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample3 {

	public static void main(String[] args) {
		
		AppiumDriver driver=null;
		
		
		
		
		
		/*
		 * AppiumDriverLocalService builder = new AppiumServiceBuilder()
		 * .withAppiumJS(new
		 * File("/usr/local/lib/node_modules/appium/build/lib/main.js")).withIPAddress(
		 * "0.0.0.0").usingPort(4723).build();
		 * 
		 * builder.start();
		 */
		
		// using UiAutomator2Options
		
		/*
		 * UiAutomator2Options adroid = new UiAutomator2Options();
		 * 
		 * adroid.setUdid("192.168.0.101:5555"); adroid.setApp(
		 * "/Users/vkappali/Downloads/3_8_Storebuilds/3_8_1_255_20230929_2028/apk/release/app-release-3.8-255.apk"
		 * );
		 */
		
		// using DesiredCapabilities
		
		
		// Simulator
		
		
		DesiredCapabilities adroid = new DesiredCapabilities();
		adroid.setCapability("appium:app",
				"/Users/vkappali/Library/Developer/Xcode/DerivedData/UIKitCatalog-dxavjwvhfhoozvcdkefdbxaqefkd/Build/Products/Debug-iphonesimulator/UIKitCatalog.app");
		adroid.setCapability("appium:automationName", "xcuitest");
		adroid.setCapability("appium:deviceName", "iPhone 15");
		adroid.setCapability("appium:platformVersion", "17.4");
		 
		
		// Real Device
		
		/*
		 * DesiredCapabilities adroid = new DesiredCapabilities();
		 * adroid.setCapability("appium:app",
		 * "/Users/vkappali/Downloads/3_8_Storebuilds/ENHO_3_8_1_105_20230930_1456_test/Enlighten_3.8.1_105.ipa"
		 * ); adroid.setCapability("appium:automationName", "xcuitest");
		 * adroid.setCapability("appium:deviceName", "Vijayakuar’s iPhone");
		 * adroid.setCapability("appium:platformVersion", "15.7");
		 */
		
		//adroid.setCapability("appium:xcodeOrgId", "M7Z9655GC3");

		//adroid.setCapability("appium:xcodeSigningId", "iPhone Developer");

	//	adroid.setCapability("appium:udid", "00008101-000D48A43CBA001E");

		//adroid.setCapability("appium:updatedWDABundleId", "00008101-000D48A43CBA001E");

		
		
		// chromebrowser
		
		
		try {
			driver = new IOSDriver(new URL("http://0.0.0.0:4723/"), adroid);
			//driver.findElement(AppiumBy.)
			Thread.sleep(30000);
			System.out.println("launched");
			driver.quit();
			Thread.sleep(3000);
			//builder.stop();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			driver.quit();
			//builder.stop();
		}
		
		

	}

}
