package org.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTask {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.snapdeal.com/login");
//		
//		WebElement Login=driver.findElement(By.id("userName"));
//		Login.sendKeys("asdfasfa@gmail.com");
//		
//		WebElement Btn=driver.findElement(By.id("checkUser"));
//		Btn.click();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone");
	
//		List<WebElement> listEle = driver.findElements(By.id("twotabsearchtextbox"));
//		listEle.get(0);
//		
		
				
		
	}

}
