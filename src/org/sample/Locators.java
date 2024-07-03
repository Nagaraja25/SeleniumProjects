package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys("Rajan");
		
		WebElement userPass=driver.findElement(By.id("pass"));
		userPass.sendKeys("raju@234566");
		
		WebElement butn=driver.findElement(By.name("login"));
		butn.click();
		
		
		
	}

}
