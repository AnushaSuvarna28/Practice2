package com.section1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
	//browser server configuration
			System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
			//launch browser
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			URL url = new URL("https://www.amazon.com/");
			driver.navigate().to(url);
			WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
			searchbox.sendKeys("flowers");
			String id = searchbox.getAttribute("value");
			System.out.println(id);
	}

}
