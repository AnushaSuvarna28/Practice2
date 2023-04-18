package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogin 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//String text = driver.findElement(By.partialLinkText("Forgot your")).getText();
		//System.out.println(text);
		driver.findElement(By.cssSelector("input#username")).sendKeys("Anusha");
		driver.findElement(By.cssSelector("input.textField.pwdfield")).sendKeys("Raveesh");
		driver.findElement(By.tagName("label")).click();
	}
}
