package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textFont {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		WebElement error = driver.findElement(By.xpath("//span[text() = 'Username or Password is invalid. Please try again.']"));
		//color
		String errorcolour = error.getCssValue("color");
		System.out.println(errorcolour);

		//font
		String errorFont  = error.getCssValue("font");
		System.out.println(errorFont);
		
		//validate
	    String actualFont = "Username or Password is invalid. Please try again.";
	    String expFont = error.getText();
		if(actualFont.equals(expFont))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not same");
		}
		

	}

}
