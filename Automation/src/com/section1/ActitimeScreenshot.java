package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		//settings
		driver.findElement(By.cssSelector(".popup_menu_button.popup_menu_button_settings")).click();
		Thread.sleep(2000);
		//click on General Settings
		driver.findElement(By.xpath("//div[text() = 'Manage system settings & configure actiTIME'] ")).click();
		WebElement gsettings = driver.findElement(By.xpath("//td[text() = 'General Settings']"));
		File src = gsettings.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/gsettings.png");
		FileUtils.copyFile(src, trg);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File tg = new File("./screenshot/gfullpage.png");
		FileUtils.copyFile(sc, tg);

	}

}
