package com.testautomation.Testauto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver = null;
	
	
	public static  void conclick(WebElement element) {
		element.click();
	}

     public static  WebDriver Browserlaunch( String options) {
		
		if (options.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\driver\\chromedriver.exe");
			
			   driver = new ChromeDriver();
			   
			   
		} else if (options.equalsIgnoreCase("edge")) {
			
		}
		
		else {
           System.out.println("invalid browser");
		}
	
	    driver.manage().window().maximize();
	    return driver;
	    
	}
	
     public static  void Urllaunch(String options) {
 		driver.get(options);		
 		 
 	}   

     public static void Actions(WebElement element, String option) {
 		
 		Actions as = new Actions(driver);
 						
 		if (option.equalsIgnoreCase("context")) {
 			as.contextClick(element).build().perform();		
 		} else if (option.equalsIgnoreCase("double")) {
 			as.doubleClick(element).build().perform();
 		} else if (option.equalsIgnoreCase("move")) {
 			as.moveToElement(element).build().perform();
 		} else if (option.equalsIgnoreCase("click")) {
 			as.click(element).build().perform();
 		}
 		else {
           System.out.println("invalid browser");
 		}
 	}
       
 	public static  void Actions1() throws AWTException {
 		Robot r = new Robot();
 		
 		
 		r.keyPress(KeyEvent.VK_DOWN);
         r.keyRelease(KeyEvent.VK_DOWN);
 	}
 	
 	public static void Actions2() throws AWTException {
 		Robot r = new Robot ();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
 	}
 	
 	public static  void Frame(WebElement element) {
      driver.switchTo().frame(element); 
 	
	}
 	
 	public static  void sel(WebElement element) {
		
 		Select s = new Select (element);
 		
    s.selectByValue("2");

	}
 	
 	public static  void sele(WebElement element) {
		driver.switchTo().defaultContent();

	}
 	
    public static  void sendkey(WebElement element) {
		element.sendKeys(null);
 
	}
     
   public static  void clos() {
	driver.close();

}
     
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
