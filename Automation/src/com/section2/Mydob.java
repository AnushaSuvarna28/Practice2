package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mydob 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String month = driver.findElement(By.className("ui-datepicker-month")).getText();
		String year = driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!(month.equals("November") && (year.equals("1998"))))
		{
			driver.findElement(By.className("ui-datepicker-prev")).click();
			month = driver.findElement(By.className("ui-datepicker-month")).getText();
			year = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		driver.findElement(By.linkText("28")).click();
		//String date = driver.findElement(By.id("datepicker")).getText();
		//System.out.println(date);
	}

}
