package com.section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication 
{

	public static void main(String[] args) 
	{
		//browser server configuration
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		//launch browser
		WebDriver driver = new ChromeDriver();
		//open aplctn
		driver.get("https://www.google.com/");
		//maximize window
		driver.manage().window().maximize();
		//minimize window
		driver.manage().window().minimize();
		//fullscreen
		driver.manage().window().fullscreen();
		}

}
