package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watch 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.className("gh-tb")).sendKeys("watch");
		driver.findElement(By.className("btn-prim")).click();
		String result = driver.findElement(By.cssSelector(".srp-controls__count-heading")).getText();
		System.out.println(result);
		
	}

}
