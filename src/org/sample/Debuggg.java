package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debuggg {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement crt = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		crt.click();
		
		WebElement userName = driver.findElement(By.name("firstname"));
		userName.sendKeys("nagaraja");
		
		WebElement userLast = driver.findElement(By.name("lastname"));
		userLast.sendKeys("vijayakumar");
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("0890809800");
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.sendKeys("wrqwerwqer");
		
		WebElement sub = driver.findElement(By.name("websubmit"));
		sub.click();

		
		
	
		
	}

}
