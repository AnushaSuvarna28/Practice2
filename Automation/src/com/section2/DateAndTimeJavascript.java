package com.section2;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateAndTimeJavascript 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("ui-state-highlight")).click();
		Thread.sleep(1000);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR,1);
		Date currentdate = cal.getTime();
		System.out.println(currentdate);
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String modifieddate = sdf.format(currentdate);
		System.out.println(modifieddate);
	}
}
