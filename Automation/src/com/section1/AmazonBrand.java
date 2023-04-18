package com.section1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrand {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		//search for clock
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("clock");
		Thread.sleep(2000);
		//select clock
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		//delete clock
		r.keyPress(KeyEvent.VK_DELETE);
		r.keyRelease(KeyEvent.VK_DELETE);
		Thread.sleep(2000);
		//search for flower
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("flowers",Keys.ENTER);
		Thread.sleep(2000);
		//get the result
		String result = driver.findElement(By.cssSelector(".a-section.a-spacing-small.a-spacing-top-small")).getText();
		System.out.println(result);
	}

}
