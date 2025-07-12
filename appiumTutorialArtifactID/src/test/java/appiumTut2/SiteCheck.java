package appiumTut2;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SiteCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // For Chrome, you can use .firefoxdriver() for Firefox
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Define the URL to open
        String url = "https://eaasthi.karnataka.gov.in/office/PublicReports/frmMutationDistrictwise.aspx";
        driver.manage().window().maximize();
        // Launch the URL
        driver.get(url);

       

        waitForPageToLoad(driver);
        // Get the title of the page to verify it loaded successfully
        System.out.println("Page Title: " + driver.getTitle());
        WebElement element = driver.findElement(By.xpath("//a[text()='2']")); // second page to see koppal
        driver.manage().window().maximize();
        // Scroll to the element using JavaScript Executor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        
        driver.findElement(By.xpath("//a[text()='2']")).click();
        waitForPageToLoad(driver);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_RecordView_ctl03_lblDISTRICTNAME\"]")).click(); // click koppal
        waitForPageToLoad(driver);
        
        WebElement element2 = driver.findElement(By.xpath("//*[text()='29045']")); // processed applications count link
        
        js.executeScript("arguments[0].scrollIntoView(true);", element2);
        
        element2.click();
        
        for(int i=2;i<201;i++) {
        	
        	try {
        		if(driver.findElement(By.xpath("//*[text()='916829']")).isDisplayed());  // check for property code
        		System.out.println("25-8-1002-544 -  found in page "+i);
        		driver.quit();
        	}catch (Exception e) {
				System.out.println("25-8-1002-544 - not found in page "+i);
			}
        	if(i%10==1) {
        		continue;
        	}
        	
        	// click on next page number
        	 WebElement elementlink = driver.findElement(By.xpath("//a[text()='"+i+"']"));
        	 js.executeScript("arguments[0].scrollIntoView(true);", elementlink);
        	 elementlink.click();
        	 waitForPageToLoad(driver);
        	 
        	 // click on ... to go next set of pages
        	 if(i%10==0) {
        		 if (i==10) {
        		 WebElement elementlinkdots = driver.findElement(By.xpath("//*[text()='...']"));
        		 js.executeScript("arguments[0].scrollIntoView(true);", elementlinkdots);
        		 elementlinkdots.click();
        		 waitForPageToLoad(driver);
        		 }else {
        			 WebElement elementlinkdots = driver.findElement(By.xpath("(//*[text()='...'])[2]"));
            		 js.executeScript("arguments[0].scrollIntoView(true);", elementlinkdots);
            		 elementlinkdots.click();
            		 waitForPageToLoad(driver);
        		 }
        	 }
        	
        }
        
        // Close the browser
      //  driver.quit();
    }

	public static void waitForPageToLoad(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Wait for the page to load by checking the readyState
        while (!js.executeScript("return document.readyState").toString().equals("complete")) {
            try {
                Thread.sleep(500); // Wait for 500 ms before checking again
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
	

}
