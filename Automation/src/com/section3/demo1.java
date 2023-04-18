package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1
{

	public static void main(String[] args) throws IOException 
	{
		//copying test data from external file to java file
		FileInputStream fis = new FileInputStream("D:\\Anchu\\selenium\\commondata.properties");
		
		//to handle properties file we have  a class in java-properties
		Properties pobj = new Properties();
		
		//load file to the object
		pobj.load(fis);
		
		//to get test data
		String url = pobj.getProperty("url");
		String username = pobj.getProperty("username");
		String password = pobj.getProperty("password");
		
		//normal code
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		

	}

}
