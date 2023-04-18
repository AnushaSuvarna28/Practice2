package com.section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customer 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('username').value = 'admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value = 'manager';");
		jse.executeScript("document.getElementById('loginButton').click();");	
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text() = 'Create Type of Work']")).click();
		driver.findElement(By.name("name")).sendKeys("afhgdfja");
		driver.findElement(By.xpath("//form[@name=\"BillingTypeModifyForm\"]/table/tbody/tr[7]/td/input[2]")).click();
		Alert alt = driver.switchTo().alert();
		String alertmsg = alt.getText();
		System.out.println(alertmsg);
		alt.dismiss();
		WebElement text = driver.findElement(By.xpath("//td[@class=\"mainContentPadding rightPadding\"]/table/tbody/tr[1]/td"));
		File src = text.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/customer.png");
		FileUtils.copyFile(src, trg);
	}

}
