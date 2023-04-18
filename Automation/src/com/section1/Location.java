package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.name("username"));
		Point location = username.getLocation();
		System.out.println(location);
		Dimension size = username.getSize();
		System.out.println(size);
		Rectangle rec = username.getRect();
		System.out.println(rec.getX());
		System.out.println(rec.getY());
		System.out.println(rec.getWidth());
		System.out.println(rec.getHeight());
	}

}
