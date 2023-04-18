package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class saching 
  {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		saching s = new saching();
		s.launchBrowser();
		Thread.sleep(2000);
		s.searchWatch();
		
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	public void searchWatch() throws InterruptedException
	{
		driver.findElement(By.cssSelector("[class='gLFyf gsfi']")).sendKeys("sachin");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.id("result-stats")).getText();
		System.out.println(result);
		
	}
    

}
