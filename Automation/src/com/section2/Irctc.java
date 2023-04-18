package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Irctc 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://irctc.com/");
		WebElement aboutus = driver.findElement(By.linkText("About Us"));
		Actions act = new Actions(driver);
		act.moveToElement(aboutus).perform();
		driver.findElement(By.linkText("Board of Directors")).click();
		String text = driver.findElement(By.xpath("//div[@class = 'responsiveTab tenders newbluebutton']/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(text);
	}
}
