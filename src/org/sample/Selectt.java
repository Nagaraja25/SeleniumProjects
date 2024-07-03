package org.sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectt {
	
	public static void main(String[] args) {
		
		
//		WebDriver driver=new ChromeDriver();
//		
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		WebElement btn = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
//		btn.click();
//		
//		
//		WebElement day = driver.findElement(By.name("birthday_day"));
//		
//		Select s1=new Select(day);
//		
//		
////		s1.selectByIndex(0);
////		s1.selectByValue("22");
//		s1.selectByVisibleText("3");
//		
//		boolean mul = s1.isMultiple();
//		System.out.println(mul);
//		
//		List<WebElement> op = s1.getOptions();
//		WebElement w = op.get(3);
//		System.out.println(w.getText());
//		
//		for(int i=0;i<op.size();i++) {
//			WebElement il = op.get(i);
//			System.out.println(il.getText());
//			
//			day.sendKeys("22");
//			
//		}
//		
		
		
//    -------------------------------MULTI SELECT------------------------------------
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cars = driver.findElement(By.id("cars"));
		
		Select s1=new Select(cars);
		
		s1.selectByIndex(0);
		s1.selectByValue("saab");
		s1.selectByVisibleText("Opel");
		
		boolean mul = s1.isMultiple();
		System.out.println(mul);
		
		List<WebElement> li = s1.getOptions();
		
		for(int i=0;i<li.size();i++){
			String tt = li.get(i).getText();
			System.out.println(tt);
			}
	//----------------get first selected---------------------------
		
		WebElement first = s1.getFirstSelectedOption();
		String f1 = first.getText();
		System.out.println(f1);
		
	//--------------get all selected------------------------------
		
		List<WebElement> all = s1.getAllSelectedOptions();
		for (WebElement x:all) {
			
			System.out.println(x.getText());
		}
		
		
	//--------------deselect-------------------------------------
		
		s1.deselectAll();
		
		
	//-------------selectall using index, using value and using text----------------------
		

		
	for(int i=0;i<li.size();i++) {
		
		s1.selectByIndex(i);
	
		
	}
		s1.deselectAll();
		
		
	for(int i=0;i<li.size();i++) {
		
		WebElement valueall = li.get(i);
		String tt = valueall.getAttribute("value");
		System.out.println(tt);
		
			
	}
	
	//---//
	
	for(WebElement y:li) {
		
		String tttt = y.getText();
		
		s1.selectByVisibleText(tttt);
			}
		
		}
	
	
	    
		
	
		
		
		
		
		
		

}
