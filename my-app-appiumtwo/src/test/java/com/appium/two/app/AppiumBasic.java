package com.appium.two.app;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumBasic extends BaseTest{
	
	

	@BeforeMethod(enabled = false)
	public void beforeRun() {
		
	}
	@Test
	public void firstTest() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	
		Thread.sleep(5000);
	}
	
	@Test
	public void GesturesLongClick() throws MalformedURLException, InterruptedException {
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();

		driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
		
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text=\"People Names\"]"));

		
		longPress(element);
				
		//Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=\"Sample menu\"]")).isDisplayed());
		
		
		Thread.sleep(5000);
	
	}
	
	@Test
	public void scrollDeom() throws MalformedURLException, InterruptedException {
	    
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
		
		//WebElement ele =  driver.findElement(By.id("android:id/list"));
		
		 Sequence dragNDrop = new Sequence(finger, 1);
	      //  int startX, startY, endX, endY;
	        
			/*
			 * startX = ele.getRect().x + (ele.getSize().width / 2); startY =
			 * ele.getRect().y + (ele.getSize().height * 3 / 4); endX = ele.getRect().x +
			 * (ele.getSize().width / 2); endY = ele.getRect().y + (ele.getSize().height /
			 * 4);
			 */
		 
		 	int scrollPercentage = 50;
	        Dimension size = driver.manage().window().getSize();

	        int width = size.width;
	        int height = size.height;

	        // X remains constant (center horizontally)
	        int startX = width / 2;
	        int endX = startX;

	        // Calculate start and end Y based on percentage
	        // Scroll up (from bottom to top)
	        int startY = (int) (height * 0.9); // start from 90% of screen
	        int endY = (int) (startY - (height * scrollPercentage)); // scroll up by scrollPercentage

//            startX =665;
//            startY = 2578;
//            endX = 624;
//            endY = 1229;
		
            
            dragNDrop.addAction(finger.createPointerMove(Duration.ofSeconds(0),
                    PointerInput.Origin.viewport(), startX, startY));
            dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
            dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(500),
                    PointerInput.Origin.viewport(), endX, endY));
            dragNDrop.addAction(finger.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
            driver.perform(Arrays.asList(dragNDrop));
		Thread.sleep(5000);
	
	}
	
	@Test
	public void scrollDeom2() throws MalformedURLException, InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@text=\"Views\"]"));
		element.click();
		
		// Java
		
		boolean canScrollMore;
		
		do {
		  canScrollMore = (Boolean) ((JavascriptExecutor)
		  driver).executeScript("mobile: scrollGesture", ImmutableMap.of( "left", 300,
		  "top", 500, "width", 400, "height", 500, "direction", "down", "percent", 5.0
		  ));
		}while(canScrollMore);

	}
	
	@Test
	public void scrollDeom3() throws MalformedURLException, InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@text=\"Views\"]"));
		element.click();
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView2\"))"));			

	

	}
	
	@Test
	public void swipe1() throws MalformedURLException, InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@text=\"Views\"]"));
		element.click();
		
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		 driver.findElement(By.xpath("//*[@text=\"1. Photos\"]")).click();
		
		 WebElement image = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		Rectangle rect =  image.getRect();
		 ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				    "left", rect.x, "top",  rect.y, "width",  rect.width, "height",  rect.height,
				    "direction", "left",
				    "percent", 0.75
				));
	
		 WebElement image2 = driver.findElement(By.xpath("//android.widget.ImageView[2]"));
	}
	
	@Test
	public void swipe2() throws MalformedURLException, InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@text=\"Views\"]"));
		element.click();
		
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		
		 driver.findElement(By.xpath("//*[@text=\"1. Photos\"]")).click();
		
		 WebElement image = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		 
		 ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) image).getId(),
				    "direction", "left",
				    "percent", 0.75
				    
				));
	
		 WebElement image2 = driver.findElement(By.xpath("//android.widget.ImageView[2]"));
		 
		 ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) image2).getId(),
				    "direction", "left",
				    "percent", 0.75,
				    "speed", 500
				));
	}
	
	@Test
	public void DragAndDrop() throws MalformedURLException, InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@text=\"Views\"]"));
		element.click();
		
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		WebElement source =driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_1"));

		// Java
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) source).getId(),
		    "endX", 826,
		    "endY", 778
		));
		
		//WebElement source2 =driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_5"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.ignoring(NoSuchElementException.class);
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.id("io.appium.android.apis:id/drag_dot_5")));
		

		
	}
	
	@Test
	public void DeviceRotate() throws MalformedURLException, InterruptedException {
		
		
		WebElement element = driver.findElement(By.xpath("//*[@text=\"Views\"]"));
		element.click();
		
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		DeviceRotation landscape = new DeviceRotation(0, 0, 90);
		
		driver.rotate(landscape);
		
		//driver.setClipboardText("aaa");	
		//driver.getClipboardText();
		
		
		driver.pressKey(new KeyEvent(AndroidKey.ALT_RIGHT));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		driver.hideKeyboard();
		

		
		// for this download chrome driver exe and set this options object base class
		driver.getContextHandles();
		
		driver.context("");
		
		driver.findElement(AppiumBy.accessibilityId("q")).sendKeys("googlr search key");
		driver.findElement(AppiumBy.accessibilityId("q")).sendKeys(Keys.ENTER);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.context("NATIVE_APP");
		
		
	}
	
	
	@Test
	public void startActivityDemo() throws InterruptedException {
		//Activity act = new Activity("io.appium.android.apis", "io.appium.android.apis.preference.PreferenceDependencies");
		Thread.sleep(5000);
	//	((JavascriptExecutor)driver).executeScript("mobile: startActivity", ImmutableMap.of("intent"," io.appium.android.apis/io.appium.android.apis.preference.PreferenceDependencies"));
	//	Thread.sleep(5000);
		
	//	((JavascriptExecutor)driver).executeScript("mobile: openNotifications");
	//	Thread.sleep(5000);
		
	//	String notificationList = (String) ((JavascriptExecutor)driver).executeScript("mobile: getNotifications");
	//	System.out.println(notificationList);
	//	Thread.sleep(5000);
		
		Boolean appTerminated = (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: terminateApp",ImmutableMap.of("appId","io.appium.android.apis"));
		System.out.println("appTerminated - "+appTerminated);
		Thread.sleep(5000);
		
		Boolean appCleared = (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: clearApp",ImmutableMap.of("appId","io.appium.android.apis"));
		System.out.println("appCleared - "+appCleared);
		
		Boolean appLaunched = (Boolean) ((JavascriptExecutor)driver).executeScript("mobile: activateApp",ImmutableMap.of("appId","io.appium.android.apis"));
		System.out.println("appLaunched - "+appLaunched);
		Thread.sleep(5000);
	}
	
	@Test
	public void secondTest() throws MalformedURLException {
		
			String nodePath = "C:\\Program Files\\nodejs\\node.exe"; // Path to node.exe on your system

	        // Set the path to the Appium JavaScript file
	        String appiumJSPath = "C:\\Users\\Vijay\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	        
	        AppiumDriverLocalService service;
	        
	        // Create an AppiumServiceBuilder instance
	        AppiumServiceBuilder builder = new AppiumServiceBuilder()
	                .usingDriverExecutable(new File(nodePath))
	                .withAppiumJS(new File(appiumJSPath));
	        
	     // Start the Appium server
	        service = AppiumDriverLocalService.buildService(builder);
	        service.start();
	        
        	System.out.println("======================================================== started server");


	        try {
	        UiAutomator2Options options = new UiAutomator2Options();
			options.setDeviceName("emulator-5554");
			options.setApp("C:\\Users\\Vijay\\Documents\\Practice\\appium2.0\\APKFiles\\resources\\ApiDemos-debug.apk");
			
			AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
			
			driver.quit();
			
	        }finally {
	        	System.out.println("======================================================== closing server");
	        	 service.stop();
	        }

	        // Perform your tests or actions here...

	        // Stop the Appium server when done
	       
	}
}
