package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathTask {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		WebElement pge = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centres in Chennai']"));
		String t = pge.getAttribute("inner text");
		System.out.println(t);
		
	}

}
