package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartsWith {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text() ='✕']")).click();
		WebElement name  = driver.findElement(By.name("q"));
		name.sendKeys("samsun mobiles");
		name.submit();
		driver.findElement(By.xpath("//span[starts-with(text(),'Showing']")).getText();

	}

}
