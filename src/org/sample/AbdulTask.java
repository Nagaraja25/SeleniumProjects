package org.sample;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AbdulTask {
	
	public static void main(String[] args) throws InterruptedException {
		
		
//		WebDriver driver=new ChromeDriver();
//		
//		
//		driver.get("https://omayo.blogspot.com/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		JavascriptExecutor Js=(JavascriptExecutor)driver;
//		
//		WebElement delayedText = driver.findElement(By.xpath("//div[@id='delayedText']"));
//		Js.executeScript("arguments[0].scrollIntoView(true)", delayedText);
//		Thread.sleep(13000);
//		String txt = delayedText.getText();
//		System.out.println(txt);
//		
//		WebElement bike = driver.findElement(By.xpath("//input[@value='Bike']"));
//		Js.executeScript("arguments[0].scrollIntoView(true)", bike);
//		bike.click();
//		
//		
//		WebElement dropDown = driver.findElement(By.xpath("//button[text()='Dropdown']"));
//		dropDown.click();
//		Thread.sleep(3000);
//		Actions a=new Actions(driver);
//		WebElement fb = driver.findElement(By.xpath("//a[text()='Facebook']"));
//		a.moveToElement(fb);
//		fb.click();
//		
//		
//		WebElement multi = driver.findElement(By.id("multiselect1"));
//		Select s=new Select(multi);
//		List<WebElement> mulOps = s.getAllSelectedOptions();
//		s.selectByIndex(0);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
//		
//		
//		WebElement search = driver.findElement(By.xpath("//input[@class='gsc-input']"));
//		search.sendKeys("Hello");
//		WebElement searchBox = driver.findElement(By.xpath("//input[@value='Search']"));
//		searchBox.click();
//		
//		
//		WebElement radioMale = driver.findElement(By.id("radio1"));
//		radioMale.click();
//		
//		
//		WebElement alertBox = driver.findElement(By.xpath("//input[@value='ClickToGetAlert']"));
//		Thread.sleep(3000);
//		alertBox.click();
//		Alert a1=driver.switchTo().alert();
//		a1.accept();
//		
//		
//		WebElement btn = driver.findElement(By.id("myBtn"));
//		btn.click();
		
		
        WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				

		WebElement firstName = driver.findElement(By.xpath("(//input[@ng-model='FirstName']"));
		firstName.sendKeys("Nagaraja");		
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']//self::input"));
		lastName.sendKeys("Vijayakumar");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("No.15, Ilangovadigal street, Pallikaranai");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']//self::input"));
		js.executeScript("arguments[0].setAttribute('value','nagarajavijayakumar25@gmail.com')", email);
		
		WebElement phn = driver.findElement(By.xpath("//input[@type='tel']//self::input"));
		phn.sendKeys("9876543210");
		
		WebElement male = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
		male.click();

		WebElement hobby1 = driver.findElement(By.xpath("//input[@id='checkbox1']"));
		hobby1.click();

		WebElement hobby2 = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		hobby2.click();
		
//		WebElement language = driver.findElement(By.id("//div[@id='msdd']"));
//		Select s=new Select(language);
//		List<WebElement> allLang = s.getAllSelectedOptions();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s1=new Select(skills);
		s1.selectByValue("APIs");
		s1.selectByValue("Excel");
		s1.selectByValue("Linux");
		
		WebElement country = driver.findElement(By.id("country"));
		Select s2=new Select(country);
		s2.selectByValue("India");
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s3=new Select(year);
		s3.selectByValue("1998");
	
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s4=new Select(month);
		s4.selectByValue("May");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s5=new Select(day);
		s5.selectByValue("25");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
