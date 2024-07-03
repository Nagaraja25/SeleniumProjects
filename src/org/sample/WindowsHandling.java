package org.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	
        public static void main(String[] args) throws AWTException, InterruptedException {
	
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphone");
				
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		
		WebElement iphone14plus = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 Plus (Starlight, 128 GB)']"));
		iphone14plus.click();
		
//		To get parent window ID
		
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		
//		To get all the window IDs
		
		Set<String> allId = driver.getWindowHandles();
		System.out.println(allId);
		

		
//		for(String x:allId) {
//			if(!parentId.equals(x)) {
//				driver.switchTo().window(x);
//				
//			}
//		}
//			
//			Thread.sleep(2000);
//			
//			WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
//			cart.click();
//			
//	
//		Thread.sleep(2000);
//		
//		WebElement rtnPolicy = driver.findElement(By.xpath("//a[text()='Returns Policy']"));
//		rtnPolicy.click();
//		
//		String parentId1 = driver.getWindowHandle();
//	
//		System.out.println(parentId1);
//			
//		Set<String> allId1 = driver.getWindowHandles();
//		System.out.println(allId1);
//		
//		for(String x1:allId1) {
//			if(!parentId1.equals(x1)) {
//				driver.switchTo().window(x1);
//				
//			}
//		}
//		
//		Thread.sleep(2000);
//				
//				
//		WebElement clickHere = driver.findElement(By.xpath("//a[text()='Click here']"));
//		
//		clickHere.click();
		
		
		List<String> li=new LinkedList<>();
		
		li.addAll(allId);
		
		driver.switchTo().window(li.get(1));
		
		Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		cart.click();
		
		
				
			}
	

}
