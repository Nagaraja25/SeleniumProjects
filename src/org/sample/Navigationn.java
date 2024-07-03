package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationn {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		driver.navigate().to("https://www.flipkart.com/");
//		
//		driver.navigate().back();
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		
//		driver.navigate().refresh();
		
		WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		boolean b1 = btn.isEnabled();
		System.out.println(b1);
		
		btn.click();
		
		WebElement radio = driver.findElement(By.xpath("//input[@name='sex']"));
		
		boolean b2 = radio.isSelected();
		System.out.println(b2);

		
		
		
		
		
		
		
		
		
	}

}
