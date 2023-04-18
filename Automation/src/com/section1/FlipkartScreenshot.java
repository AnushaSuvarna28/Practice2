package com.section1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenshot {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver dv = new ChromeDriver();
		dv.manage().window().maximize();
		dv.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		dv.findElement(By.xpath("//button[text() = '✕']")).click();
		WebElement wb = dv.findElement(By.className("InyRMC"));
		File src = wb.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/flip.png");
		FileUtils.copyFile(src,trg);
		

	}

}
