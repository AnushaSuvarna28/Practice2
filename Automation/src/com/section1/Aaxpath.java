package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aaxpath {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("D:/Anchu/selenium/Registration.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("anu");
	}
}
