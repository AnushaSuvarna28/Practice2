package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumClickAndHold 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		WebElement a = driver.findElement(By.xpath("//li[text()='A']"));
		WebElement b = driver.findElement(By.xpath("//li[text()='B']"));
		Actions act = new Actions(driver);
		//act.clickAndHold(ele).perform();
		//act.release(ele).perform();
		
		//act.moveToElement(ele).clickAndHold().release().build().perform();
		
		act.clickAndHold(a).moveToElement(b).release().build().perform();
		
		}

}
