package com.section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMsg 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']")).click();
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		System.out.println(msg);
		alt.sendKeys("hii anusha");
		alt.accept();
		String result = driver.findElement(By.id("result")).getText();
		System.out.println(result);
	}

}
