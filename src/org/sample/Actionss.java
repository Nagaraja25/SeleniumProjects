package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionss {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		----------------------Move to element and click-----------------------------------
		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.flipkart.com/");
//		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		
//		WebElement beauty = driver.findElement(By.xpath("//span[text()='Beauty, Toys & More']"));
//		
//		Actions a=new Actions(driver);
//		
//		a.moveToElement(beauty).perform();
//		
//		WebElement foods = driver.findElement(By.xpath("//a[text()='Food & Drinks']"));
//		
//		a.moveToElement(foods).perform();
//		
//		WebElement nuts = driver.findElement(By.xpath("//a[text()='Nuts & Dry Fruits']"));
//		nuts.click();		
		
		
//        -------------------------Drag and drop---------------------------------------------
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement src = driver.findElement(By.id("credit4"));
		
		WebElement des = driver.findElement(By.id("shoppingCart3"));
		
		Actions a=new Actions(driver);
		
		Thread.sleep(5000);
		
//		a.dragAndDrop(src, des).perform();
		
		a.clickAndHold(src).release(des).click().perform();
		
		
		
		
		
		
		


	
		
		
	}

}
