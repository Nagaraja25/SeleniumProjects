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

public class XpathTaskk {
	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("http://www.greenstechnologys.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		WebElement gTech = driver.findElement(By.className("blue_text"));
//		String text = gTech.getText();
//		
//		System.out.println(text);
		
		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement fb = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
//		String t = fb.getText();
//		
//		System.out.println(t);

		
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement ele = driver.findElement(By.className("product_name"));
//		
//		Actions a=new Actions(driver);
//		a.click(ele).perform();
	
		
//		driver.get("https://www.flipkart.com/hnf24-bau-ab-store?param=2467&fm=neo%2Fmerchandising&iid=M_e1b772d2-fdab-472c-9717-dac197c804fc_1_KUZ8W60OFFMO_MC.IF1WVE47NIXO&otracker=hp_rich_navigation_7_1.navigationCard.RICH_NAVIGATION_Home%2B%2526%2BKitchen_IF1WVE47NIXO&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_7_L0_view-all&cid=IF1WVE47NIXO");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
		
//		WebElement f1 = driver.findElement(By.className("TSD49J"));
//		
//		Actions a=new Actions(driver);
//		a.moveToElement(f1).perform();
		
		
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement t1 = driver.findElement(By.id("heading20"));
		Actions a=new Actions(driver);
				
		a.click(t1).perform();
		
		
		WebElement t2 = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		
		
		a.contextClick(t2).perform();
		

		
		Robot r=new Robot();
		
		
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
	}
	

}
