package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todaydate 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		//change focus to frame
		driver.switchTo().frame(0);
		
		// click on date field
		driver.findElement(By.id("datepicker")).click();
		
		//click on current date
		WebElement ele = driver.findElement(By.className("ui-state-highlight"));
		
		//tomarrow
		ele.sendKeys(Keys.TAB,Keys.ENTER);
		
	}

}
