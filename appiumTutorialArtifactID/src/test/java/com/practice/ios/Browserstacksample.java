package com.practice.ios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class Browserstacksample {

	public static void main(String[] args) throws InterruptedException {

		AppiumDriver driver;

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "IOS");
		capabilities.setCapability("appium:autoAcceptAlerts", true);
		capabilities.setCapability("appium:platformVersion", "17.0");
		capabilities.setCapability("appium:deviceName", "iPhone 15 Pro");
		capabilities.setCapability("appium:automationName", "XCUITest");

		/*
		 * capabilities.setCapability("platformName", "ANDROID");
		 * capabilities.setCapability("appium:autoGrantPermissions", true);
		 * capabilities.setCapability("appium:platformVersion", "12.0");
		 * capabilities.setCapability("appium:deviceName", "Samsung Galaxy S22 Ultra");
		 * capabilities.setCapability("appium:automationName", "UiAutomator2");
		 */

		/*
		 * HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		 * browserstackOptions.put("appiumVersion", "2.4.1");
		 * capabilities.setCapability("bstack:options", browserstackOptions);
		 */

		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("appiumVersion", "2.4.1");

		browserstackOptions.put("interactiveDebugging", "true");
		browserstackOptions.put("sessionName", "sample");
		// browserstackOptions.put("geoLocation", "IN");
		browserstackOptions.put("idleTimeout", "180");
		capabilities.setCapability("bstack:options", browserstackOptions);
		// capabilities.setCapability("appium:app", "iosapp_prod");
		capabilities.setCapability("appium:app", "iosapp_prod");

		System.out.println(capabilities);
		// XCUITestOptions adroid = new XCUITestOptions(capabilities);

		try {
			driver = new IOSDriver(new URL("https://mobileqa8:WkxGw1mupvY9HgCdKVqQ@hub-cloud.browserstack.com/wd/hub"), capabilities);
			// https://mobileqa8:WkxGw1mupvY9HgCdKVqQ@hub-cloud.browserstack.com/wd/hub
			Thread.sleep(5000);
			driver.quit();
		} catch (MalformedURLException e) {
			// e.printStackTrace();
		} /*
			 * catch (InterruptedException e) { //e.printStackTrace(); }
			 */

	}

}
