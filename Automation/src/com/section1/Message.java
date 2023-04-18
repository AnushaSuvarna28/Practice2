package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Message {

	public static void main(String[] args) throws InterruptedException 
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
		//click on types of work
		driver.findElement(By.linkText("Types of Work")).click();
	    // click on create type of work
		driver.findElement(By.xpath("//span[text() = 'Create Type of Work']")).click();
		Thread.sleep(2000);
		//printing text
		System.out.println(driver.findElement(By.className("pagetitle")).getText());
	}

}
