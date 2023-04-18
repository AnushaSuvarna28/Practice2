package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectedNot {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkbox = driver.findElement(By.cssSelector("[type='checkbox']"));
		checkbox.click();
		if(checkbox.isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
			//checkbox.click();
		}

	}

}
