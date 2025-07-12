package com.appium.two.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	AppiumDriverLocalService serviceBuilder = null;
	AndroidDriver driver;
	
	@BeforeSuite(enabled = false)
	public void configureAppiumServer() {
		 serviceBuilder = new AppiumServiceBuilder()
					.withAppiumJS(new File("C:\\Users\\Vijay\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();
			
			serviceBuilder.start();
	}
	
	@BeforeClass
	public void createDriver() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		
		//options.setDeviceName("emulator-5554");
		options.noReset();
		options.skipServerInstallation();
		//options.setApp("C:\\Users\\Vijay\\Documents\\Practice\\appium2.0\\APKFiles\\resources\\General-Store.apk");
		options.setApp(System.getProperty("user.dir")+"ApiDemos-debug.apk");
		options.setNewCommandTimeout(Duration.ofSeconds(10));
		//options.setChromedriverExecutable("path to chrome driver .exe")
		options.setAppActivity(" io.appium.android.apis/.ApiDemos");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	
	@AfterSuite(enabled = false)
	public void closeServer() {
		serviceBuilder.stop();
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void longPress(WebElement elem) {
		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) elem).getId(),"duration",3000
			));
	}
}
