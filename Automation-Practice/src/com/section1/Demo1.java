package com.section1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 
{

	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		//launch browser
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.google.com/");
				driver.getTitle();
				driver.getPageSource();
				driver.getTitle();
	}
}