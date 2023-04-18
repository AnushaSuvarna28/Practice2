package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Watchg 
{
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		Watchg W = new Watchg();
		W.launchBrowser();
		Thread.sleep(2000);
		W.searchWatch();

	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	public void searchWatch()
	{
		driver.findElement(By.className("gh-tb")).sendKeys("watch");
		driver.findElement(By.className("btn-prim")).click();
		String result = driver.findElement(By.cssSelector(".srp-controls__count-heading")).getText();
		System.out.println(result);
	}

}
