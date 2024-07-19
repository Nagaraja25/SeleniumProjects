package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopulationTask {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.worldometers.info/world-population/");
		WebElement content = driver.findElement(By.xpath("//div[@class='content-inner']"));
		
		for(int i=0;i<10;i++) {
			
			Thread.sleep(2000);
			
			WebElement currentPop = content.findElement(By.xpath("//div[@class='maincounter-number']"));
			System.out.println(currentPop.getText());
			
			WebElement today = content.findElement(By.xpath("//div[@class='col1in']"));
			System.out.println(today.getText());
			
			WebElement year = driver.findElement(By.xpath("//div[@class='col2in']"));
			System.out.println(year.getText());
				
			
			
		}
		
		
		driver.quit();


}
}