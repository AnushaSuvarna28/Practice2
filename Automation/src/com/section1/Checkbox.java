package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("iphonex");
		search.submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Add to Compare'][1]")).click();
		driver.findElement(By.xpath("//span[text() = 'Add to Compare'][13]")).click();
	
	}
}
