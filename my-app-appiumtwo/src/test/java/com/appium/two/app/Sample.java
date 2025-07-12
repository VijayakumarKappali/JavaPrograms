package com.appium.two.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Sample {

	public static void main(String[] args) throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		//options.setApp("C:\\Users\\Vijay\\Documents\\Practice\\appium2.0\\APKFiles\\resources\\General-Store.apk");
		options.setApp("C:\\Users\\Vijay\\Documents\\Practice\\appium2.0\\APKFiles\\resources\\ApiDemos-debug.apk");
		options.setNewCommandTimeout(Duration.ofSeconds(10));
		//options.setChromedriverExecutable("path to chrome driver .exe")
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}

}
