package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DescendantAndStartsWith 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//xpath by starts with
		driver.findElement(By.xpath("//label[starts-with(text() , 'Keep me logged in')]")).click();
		//xpath by descendant
		driver.findElement(By.xpath("//table[@class=\"mainArea\"]/descendant::div"));

	}

}
