package org.sample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertss {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		WebElement button1 = driver.findElement(By.id("OKTab"));
//		button1.click();
//
//
//		Alert a=driver.switchTo().alert();
//		String t1 = a.getText();
//		System.out.println(t1);
//		a.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		button2.click();
		
		WebElement dis = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		dis.click();


        Alert a1 = driver.switchTo().alert();
        String t2 = a1.getText();
        System.out.println(t2);
        a1.dismiss();
		
		
		
		
		
	}

}
