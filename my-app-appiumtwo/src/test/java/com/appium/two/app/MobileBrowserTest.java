package com.appium.two.app;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class MobileBrowserTest extends BroswerBase{

	@Test
	public void broserTest() throws MalformedURLException, InterruptedException {
	driver.get("http://www.google.com");
	
	driver.findElement(By.xpath("//*[text()='Sign in']")).click();
	
	Thread.sleep(3000);
	}
}
