package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {
	
	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.edge.driver","C:\\Users\\NAGARAJA\\eclipse-workspace\\SeleniumSample\\Driver\\msedgedriver.exe");
				
		
		WebDriver driver=new EdgeDriver();
		
		//		driver.get("https://www.cricbuzz.com/");
//		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		
//		
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		driver.quit();
		
		
	}
	
	

}
