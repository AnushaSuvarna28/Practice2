package com.section1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.get("https://ebay.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
		
	}

}
