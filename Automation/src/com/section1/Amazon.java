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

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement amazon = driver.findElement(By.id("nav-logo-sprites"));
		File src = amazon.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/amazon.png");
		FileUtils.copyFile(src, trg);	
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sc = ts.getScreenshotAs(OutputType.FILE);
		File tg = new File("./screenshot/afullpage.png");
		FileUtils.copyFile(sc, tg);
	}

}
