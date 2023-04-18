package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonBrandActions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(200);
		Actions act = new Actions(driver);
		act.keyUp(Keys.SHIFT).sendKeys(search, "clock").perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		Thread.sleep(2000);
		search.sendKeys(Keys.DELETE);
		//act.keyDown(Keys.SHIFT).sendKeys(search,"flowers");
		search.sendKeys("flowers",Keys.ENTER);
	}
}
