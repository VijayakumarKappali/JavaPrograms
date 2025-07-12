package appiumTut2;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Anndroid_BS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
		
		
		caps.setCapability("appium:app", "androidapp_prod");
		
		
		caps.setCapability("platformName", "android");
		caps.setCapability("appium:platformVersion", "14.0");
		caps.setCapability("appium:deviceName", "Samsung Galaxy S24");
		try {
		AndroidDriver driver = new AndroidDriver(new URL("https://mobileqa8:WkxGw1mupvY9HgCdKVqQ@hub-cloud.browserstack.com/wd/hub"),caps);
		
		Thread.sleep(10000);
		
		driver.quit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
