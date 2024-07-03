package org.sample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshott {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		TakesScreenshot ts=(TakesScreenshot) driver;
//		
//		File src = ts.getScreenshotAs(OutputType.FILE);
//		System.out.println(src);
//		
//		File des=new File("C:\\Users\\NAGARAJA\\eclipse-workspace\\SeleniumSample//Sample.png");
//		
//		FileUtils.copyFile(src, des);
//		System.out.println("Done");
	
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("122323");
		File src = txtPass.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\\\Users\\\\NAGARAJA\\\\eclipse-workspace\\\\SeleniumSample//Sample1.png");
		
		FileUtils.copyFile(src, des);
		
		System.out.println("Done");
		
		
			
		
		
	}

}
