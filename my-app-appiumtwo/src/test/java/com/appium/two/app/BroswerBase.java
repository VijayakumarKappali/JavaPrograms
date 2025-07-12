package com.appium.two.app;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BroswerBase {
	AppiumDriverLocalService serviceBuilder = null;
	AndroidDriver driver;
	
	
	@BeforeClass
	public void createDriver() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("emulator-5554");
		//options.setApp("C:\\Users\\Vijay\\Documents\\Practice\\appium2.0\\APKFiles\\resources\\General-Store.apk");
		options.setNewCommandTimeout(Duration.ofSeconds(10));
		options.setChromedriverExecutable("C:\\Users\\Vijay\\Downloads\\chromedriver_win32\\chromedriver.exe");
		options.setCapability("browserName", "Chrome");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}
