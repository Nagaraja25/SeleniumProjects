package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath1 {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		
		
//		 ------------------xpath using text-------------------------
     	
		
		driver.get("https://www.facebook.com/");
		
//	
//		WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));
//		create.click();
	
		WebElement sub = driver.findElement(By.xpath("//div[text()='for a celebrity, brand or business.']"));
     	String s=sub.getText();
     	System.out.println(s);
//     	
//     	
//     	WebElement page = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]"));
//     	String p = page.getText();
//     	System.out.println(p);
     	
     	
//     	WebElement txtUsr = driver.findElement(By.xpath("//input[contains(@id,'em')]"));
//     	txtUsr.sendKeys("rarere@gmail.com");
//     	String us = txtUsr.getAttribute("value");
//     	System.out.println(us);
     	
     	WebElement txtPass = driver.findElement(By.xpath("//input[contains(@id,'pas')]"));
     	txtPass.sendKeys("23434");
     	String pass = txtPass.getAttribute("value");
     	System.out.println(pass);
     	
     	String br = sub.getAttribute("inner value");
     	System.out.println(br);
     	
     	
		
	}

}
