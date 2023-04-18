package com.section1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting1 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String url = pobj.getProperty("url");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

}
