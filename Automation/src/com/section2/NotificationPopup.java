package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//font[text() = 'Free Mock Tests']")).click();

	}

}
