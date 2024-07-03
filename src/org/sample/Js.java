package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		WebElement txtUser = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','Raja')", txtUser);
		
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','234555')", txtPass);
		
		
//		WebElement btn = driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click()", btn);
		
		
//		Object ob = js.executeScript("return arguments[0].getAttribute('value')", txtUser);
//		System.out.println(ob);
	
		
		Object ob1 = js.executeScript("arguments[0].getAttribute('value')", txtPass);		System.out.println(ob1);
		
		
		String ob=(String)js.executeScript("return arguments[0].getAttribute('value')", txtUser);
		System.out.println(ob);
		
		
//	    ScrollintoView is true, this means it is scroll down
		
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		js.executeScript("arguments[0].scrollIntoView('true')", help);
		
		Thread.sleep(3000);
		
		
//      ScrollintoView is false, this means it is scroll up
		
		WebElement up = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].scrollIntoView('false')", up);
		
		
		
	}
	

}
