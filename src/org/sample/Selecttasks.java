package org.sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecttasks {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("http://demo.guru99.com/test/newtours/register.php");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		WebElement state = driver.findElement(By.name("country"));
//		
//		Select s=new Select(state);
//		List<WebElement> li = s.getOptions();
//		
		
//		for(WebElement x:li) {
//			String t = x.getText();
//			System.out.println(t);
//		}
		
//		for(int i=0;i<li.size();i++) {
//		   String list = li.get(i).getText();
//		   System.out.println(list);
//		}
		
	
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		
		Select s=new Select(fruits);
		
		List<WebElement> list = s.getOptions();
		
	
//		for(int i=1;i<list.size();i+=2) {
//			
//			WebElement even = list.get(i);
//			String evenfruits = even.getText();
//			System.out.println(evenfruits);
//		
//			
//			}
		
//		for(int i=0;i<list.size();i++) {
//			
//			s.selectByIndex(i);
//			
//			
//		}
		
	
		
		
		
		
	}

}
