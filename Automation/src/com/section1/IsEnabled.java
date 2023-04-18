package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Anchu/selenium/Registration.html");
		WebElement username = driver.findElement(By.cssSelector("[placeholder='username']"));
		if(username.isEnabled())
		{
			System.out.println("Username is Enabled");
		}
		else
		{
			System.out.println("Username is not enabled");
		}

	}

}
