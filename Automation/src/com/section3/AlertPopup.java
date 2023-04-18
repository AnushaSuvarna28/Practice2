package com.section3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.ENTER);
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.id("popup_menu_item_2")).click();
		driver.findElement(By.xpath("//span[text() = 'Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("Anusha");
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		Alert alt = driver.switchTo().alert();
		String msg = alt.getText();
		alt.accept();
		System.out.println(msg);
		System.out.println(driver.getTitle());
	}

}
