package com.section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todaydateusingjava 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		//current date
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR,1);
		Date currentdate = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String modifieddate = sdf.format(currentdate);
		
		//change focus to frame
		driver.switchTo().frame(0);
		
		// click on date field
		driver.findElement(By.id("datepicker")).sendKeys(modifieddate,Keys.ENTER);
		

	}

}
