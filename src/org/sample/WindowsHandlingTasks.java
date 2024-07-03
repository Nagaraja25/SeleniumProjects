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
import org.openqa.selenium.interactions.Actions;

public class WindowsHandlingTasks {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
//	---------------------------TASK 1-------------------------------------------------
		
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.amazon.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.sendKeys("iphone X");
//		
//		WebElement searchIcon = driver.findElement(By.xpath("//input[@value='Go']"));
//		searchIcon.click();
//		
//		Thread.sleep(2000);
//
//
//		WebElement iphone = driver.findElement(By.xpath("//span[text()='iPhone X (64GB, Space Gray) [Locked] + Carrier Subscription']"));
//		
//		Actions a=new Actions(driver);
//		
//		a.moveToElement(iphone).perform();
//		
//		a.contextClick(iphone).perform();
//		
//		Robot r=new Robot();
//		
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		
		
// ------------------------------TASK 2----------------------------------------------------------------
		
		
//		driver.get("https://www.snapdeal.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		WebElement keyword = driver.findElement(By.name("keyword"));
//		keyword.sendKeys("iphone 7");
//		
//		WebElement searchBox = driver.findElement(By.className("searchTextSpan"));
//		searchBox.click();
//
//		WebElement iphone7 = driver.findElement(By.xpath("//p[@title='Apple Iphone 7 Plus Bumper Cases Kosher Traders - Transparent Premium Transparent Case']"));
//		iphone7.click();
//		
//		
//		String parentId = driver.getWindowHandle();
//		System.out.println(parentId);
//		
//		Set<String> allId = driver.getWindowHandles();
//		System.out.println(allId);
//		
//		List<String> li=new LinkedList<>();
//		li.addAll(allId);
//		
//		
//		driver.switchTo().window(li.get(1));
//		
//		WebElement cart = driver.findElement(By.xpath("//span[text()='add to cart']"));
//		cart.click();
		
//------------------------------TASK 4---------------------------------------------------------------
		
		driver.get("http://www.greenstechnologys.com/python-training.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		
		WebElement sel = driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']"));
		sel.click();
		
		
		


		
	}

}
