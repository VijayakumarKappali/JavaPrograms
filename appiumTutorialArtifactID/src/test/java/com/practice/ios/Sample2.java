package com.practice.ios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Sample2 {

	public static void main(String[] args) {
		
		AppiumDriver driver = null;
		
		
		
		
		
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
		
		DesiredCapabilities adroid = new DesiredCapabilities();
		adroid.setCapability("appium:udid", "10.72.84.68:5555");
		adroid.setCapability("appium:app", "/Users/vkappali/Downloads/3_8_Storebuilds/3_8_1_255_20230929_2028/apk/release/app-release-3.8-255.apk");
		
	//	adroid.setCapability("appium:app", "/Users/vkappali/Documents/WorkSpaces/appium2docs/resources/ApiDemos-debug.apk");
		

		adroid.setCapability("appium:automationName", "uiautomator2");
		adroid.setCapability("platformName", "android");
		adroid.setCapability("appium:ignoreHiddenApiPolicyError", true);
		adroid.setCapability("appium:ignoreUnimportantViews", false);
		adroid.setCapability("allowInvisibleElements", true);
		adroid.setCapability("appium:autoGrantPermissions", true);

		//adroid.setCapability("appium:fullReset", true);
		//adroid.setCapability("appium:noReset", false);

		//adroid.setCapability("appium:autoGrantPermissions", true);


		
		
		
		// chromebrowser
		
		
		try {
			System.out.println("Launching ");
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/"), adroid);
			System.out.println("Launched ");
			Thread.sleep(2000);
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//android.widget.EditText[@resource-id='email']")));
			
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("qa");

			driver.findElement(AppiumBy.xpath("//*[@resource-id='loginButton']")).click();
			Thread.sleep(10000);
			System.out.println("email found ");
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='email']")).sendKeys("homeowner20220@gmail.com");
			driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='password']")).sendKeys("Test@1234");
			driver.findElement(AppiumBy.xpath("//*[@resource-id='loginButton']")).click();
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(AppiumBy.xpath("//*[@text='ENERGY']")));

			driver.findElement(AppiumBy.xpath("//*[@text='ENERGY']")).click();
			Thread.sleep(4000);
			driver.findElement(AppiumBy.xpath("//*[@resource-id='Gfilter1']")).isDisplayed();
		//	driver.findElement(AppiumBy.xpath("//*[@resource-id='Gfilter2']")).isDisplayed();
			driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"Gfilter2\")")).isDisplayed();

			driver.findElement(AppiumBy.xpath("//*[@resource-id='Gfilter3']")).isDisplayed();

			driver.findElement(AppiumBy.xpath("//*[@resource-id='Gfilter4']")).click();
			
			/*
			 * WebElement scrollObjectName =
			 * driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[1])[3]"));
			 * ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
			 * ImmutableMap.of("elementId", ((RemoteWebElement) scrollObjectName).getId(),
			 * "direction", "down", "percent", 2));
			 */

			
			/*
			 * driver.findElement(AppiumBy.accessibilityId("Views")).click();
			 * Thread.sleep(2000); driver.findElement(AppiumBy.
			 * androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\"ScrollBars\"));"
			 * ));
			 * 
			 * driver.findElement(AppiumBy.accessibilityId("ScrollBars")).click();
			 * Thread.sleep(1000);
			 * 
			 * driver.findElement(AppiumBy.accessibilityId("3. Style")).click();
			 * 
			 * WebElement ele =
			 * driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[1])[3]"));
			 * 
			 * scroll(driver,ele,ScrollDirection.DOWN,0.5,Duration.ofMillis(1000));
			 */
			
			Thread.sleep(5000);
			driver.quit();
			
			//builder.stop();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (Exception e) {
			//builder.stop();
			//if(driver !=null)
			System.out.println(driver.getPageSource());
			System.out.println("quit driver");
			e.printStackTrace();
			driver.quit();
		}
		
		

	}
	
	 public static void scroll(AppiumDriver AppDriver,WebElement panel, ScrollDirection dir, double scrollRatio, Duration SCROLL_DUR) {
	        Point midPoint;
	        Dimension size;

	        if (scrollRatio < 0 || scrollRatio > 1) {
	            throw new Error("Scroll distance must be between 0 and 1");
	        }

	        if(panel != null){
	            midPoint = getCenter(panel);
	        }else{ //entire screen is scrollable
	            size = AppDriver.manage().window().getSize();
	            System.out.println(size);
	            midPoint = new Point((int) (size.width * 0.5), (int) (size.height * 0.5));
	        }

	        int bottom = midPoint.y + (int) (midPoint.y * scrollRatio);
	        int top = midPoint.y - (int) (midPoint.y * scrollRatio);
	        int left = midPoint.x - (int) (midPoint.x * scrollRatio);
	        int right = midPoint.x + (int) (midPoint.x * scrollRatio);

	        if (dir == ScrollDirection.UP) {
	            swipe(AppDriver,new Point(midPoint.x, top), new Point(midPoint.x, bottom), SCROLL_DUR);
	        } else if (dir == ScrollDirection.DOWN) {
	            swipe(AppDriver,new Point(midPoint.x, bottom), new Point(midPoint.x, top), SCROLL_DUR);
	        } else if (dir == ScrollDirection.LEFT) {
	            swipe(AppDriver,new Point(left, midPoint.y), new Point(right, midPoint.y), SCROLL_DUR);
	        } else {
	            swipe(AppDriver,new Point(right, midPoint.y), new Point(left, midPoint.y), SCROLL_DUR);
	        }
	    }

	    protected static void swipe(AppiumDriver AppDriver,Point start, Point end, Duration duration) {

	        PointerInput input = new PointerInput(PointerInput.Kind.TOUCH, "finger1");
	        Sequence swipe = new Sequence(input, 0);
	        swipe.addAction(input.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), start.x, start.y));
	        swipe.addAction(input.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
	        /*if (isAndroid) {
	            duration = duration.dividedBy(ANDROID_SCROLL_DIVISOR);
	        } else {
	            swipe.addAction(new Pause(input, duration));
	            duration = Duration.ZERO;
	        }*/
	        swipe.addAction(input.createPointerMove(duration, PointerInput.Origin.viewport(), end.x, end.y));
	        swipe.addAction(input.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
	        (AppDriver).perform(ImmutableList.of(swipe));
	    }
	    
	    private static Point getCenter(WebElement el) {
	        Point location = el.getLocation();
	        Dimension size = el.getSize();
	        return new Point(location.x + size.getWidth() / 2, location.y + size.getHeight() / 2);
	    }
	    
	    public enum ScrollDirection {
	        UP, DOWN, LEFT, RIGHT
	    }
	    

}
