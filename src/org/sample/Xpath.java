package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://www.facebook.com/");
		
//      driver.get("https://www.google.co.in/");
		
//     	driver.get("https://www.instagram.com/");
		
//		
//		WebElement userId = driver.findElement(By.id("email"));
//		userid.sendKeys("dasfaosdf2@gmail.com"); 
		
//		
//		WebElement userPass = driver.findElement(By.id("pass"));
//		userpass.sendKeys("132121");
//	
		
//		WebElement userin = driver.findElement(By.className("inputtext"));
//		userin.sendKeys("adsfasfd@gmail.com");
		
		
//		------------------facebook----------------------------
		
//		WebElement userLog = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/div[1]/form/div/div[1]/input[@type='text']"));
//		userLog.sendKeys("asfdasfddasf@afdafs.com");
	    
	    
//	    WebElement login = driver.findElement(By.xpath("//input[@type='text']"));
//	    login.sendKeys("asdfasdf@fdafds.com");
		
		
//		-----------------google-------------------------------
		
//		WebElement typeWord = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div/div[1]/div[1]/div/div[2]/textarea[@aria-controls='Alh6id']"));
//		typeWord.sendKeys("Hello");
        
//        WebElement typeWord = driver.findElement(By.xpath("//textarea[@maxlength='2048']"));
//        typeWord.sendKeys("Vanakkam Chennai");
		
//		----------------Instagram-----------------------------
		
//		WebElement userLog = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[1]/div/label/input[@aria-label='Phone number, username, or email']"));
//		userLog.sendKeys("raju1998@gmail.com");
//		
//		WebElement userPass = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/article/div[2]/div[1]/div[2]/form/div/div[2]/div/label/input[@aria-label='Password']"));
//		userPass.sendKeys("sdf123223");
     	
     	WebElement userLog = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
     	userLog.sendKeys("asdfsad@gmail.com");
	

     	

     	
     	
     	
     	
     	


	}
	
}