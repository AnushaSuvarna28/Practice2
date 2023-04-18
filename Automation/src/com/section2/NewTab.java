package com.section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab 
{
	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.co.in/");
		String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().window(mainid);
		String title = driver.getTitle();
		System.out.println(title);
	}
	
}
