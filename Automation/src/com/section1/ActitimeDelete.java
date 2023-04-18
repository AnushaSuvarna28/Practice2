package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeDelete 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//table[@class=\"headerRowTable\"]/tbody/tr/td[1]/div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("delete")).click();
		Thread.sleep(2000);
		String result = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(result);
	}

}
