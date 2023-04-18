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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	
	public class KeysClass
	{
	
		public static void main(String[] args) throws AWTException, InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("-disable-notifications");
			WebDriver driver = new ChromeDriver(opt);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		    driver.switchTo().frame(0);
		    driver.findElement(By.xpath("//font[text() = 'Free Mock Tests']")).click();
	}
}
