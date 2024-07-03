package org.sample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framestask {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		
//		driver.switchTo().frame(0);
//		
//		WebElement btn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
//		btn.click();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mainFrame = driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
		driver.switchTo().frame(mainFrame);
		
		WebElement usrId = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
		usrId.sendKeys("adsfas@gmail.com");
		
		WebElement usrPass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		usrPass.sendKeys("asefaesf");
		
		WebElement btn = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		btn.click();
		
	
		
		
	}

}
