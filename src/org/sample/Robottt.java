package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robottt {
	
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement usrName = driver.findElement(By.id("email"));
		usrName.sendKeys("Raja");
		
		Actions a=new Actions(driver);
		a.doubleClick(usrName).perform();
		
//		a.contextClick(usrName).perform();

        Robot r=new Robot();
        
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        
//        r.keyPress(KeyEvent.VK_DOWN);
//        r.keyRelease(KeyEvent.VK_DOWN);
//        
//        r.keyPress(KeyEvent.VK_ENTER);
//        r.keyRelease(KeyEvent.VK_ENTER);
//        
//        WebElement passwrd = driver.findElement(By.id("pass"));
//        
//        
//        a.contextClick(passwrd).perform();
//      
//        
//    
//        for(int i=0;i<4;i++) {
//        	
//        	r.keyPress(KeyEvent.VK_ENTER);
//        	r.keyPress(KeyEvent.VK_ENTER);
//        	
//        }
        
//        ----------------------------shortcuts-----------------------------
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_C);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_C);
        
        r.keyPress(KeyEvent.VK_TAB);
        r.keyPress(KeyEvent.VK_TAB);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
     


		
	
		
	}

}
