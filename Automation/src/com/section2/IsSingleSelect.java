package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSingleSelect 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Anchu/selenium/Dropdown.html");
		WebElement wb = driver.findElement(By.id("Anusha Suvarna"));
		Select s = new Select(wb);
		Boolean cond = s.isMultiple();
		if(cond == true)
		{
			System.out.println("Multiselect dropdown");
		}
		else
		{
			System.out.println("Single select dropdown");
		}
		

	}

}
