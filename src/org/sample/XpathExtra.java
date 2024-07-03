package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExtra {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//self
//		WebElement self = driver.findElement(By.xpath("//a[contains(text(),'Jyothy Labs')]/self::a"));
//		System.out.println(self.getText());
		
//		//parent
//		WebElement parent = driver.findElement(By.xpath("//a[contains(text(),'Jyothy Labs')]/parent::td"));
//		System.out.println(parent.getText());
//		
//		//ancestor
//		WebElement ancestor = driver.findElement(By.xpath("//a[contains(text(),'Jyothy Labs')]/ancestor::tr"));
//		System.out.println(ancestor.getText());
		
		//child
		WebElement child = driver.findElement(By.xpath("//a[contains(text(),'Jyothy Labs')]/ancestor::tr/child::td"));
		System.out.println(child.getSize());
	}

}
