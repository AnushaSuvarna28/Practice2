package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mpriceg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphone X");
		Thread.sleep(2000);
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(price);
	}

}
