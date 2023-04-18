package com.section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DateOfBirthday 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		//WebElement currentdate = driver.findElement(By.className("ui-state-highlight"));
		//currentdate.click();
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR, -24);
		cal.add(Calendar.DAY_OF_YEAR, 24);
		Date dob = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String modifieddate = sdf.format(dob);
		System.out.println(modifieddate);
		/*List<WebElement> alldates = driver.findElements(By.id("datepicker"));
		for(WebElement date : alldates)
		{
			if(!date.equals(dob))
			{
				driver.findElement(By.xpath("ui-datepicker-prev")).click();
			}
			else
			{
				System.out.println(dob);
			}
			
		}*/
	}

}
