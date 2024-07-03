package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framess {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		driver.switchTo().frame(0);
		
		driver.switchTo().frame("firstFr");
		
		WebElement txtU = driver.findElement(By.name("fname"));
		txtU.sendKeys("Raja");
		
		
		WebElement email = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(email);
		
		WebElement txtuser = driver.findElement(By.name("email"));
		txtuser.sendKeys("asfoasdfu@gmail.com");
		
//		This default content will make the driver to come out of the frame
		
//		driver.switchTo().defaultContent();

//      This line below will move the control to switch to the parent fram
		
		driver.switchTo().parentFrame();
		txtU.clear();
		txtU.sendKeys("Naga");
		
	}
	

}
