package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePgm 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		//handle frame using index
		driver.switchTo().frame(1);
		String text = driver.findElement(By.xpath("//div[text() = 'Jobs']")).getText();
		System.out.println(text);
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
