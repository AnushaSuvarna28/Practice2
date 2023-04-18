package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeandDateSuggestion 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.timeanddate.com/");
		driver.findElement(By.xpath("//div[@id ='main-content']/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form/input")).sendKeys("bang");
		List<WebElement> wb = driver.findElements(By.xpath("//ul[@class=\"asu\"]/li/a/span[1]"));
		for(WebElement wbs : wb)
		{
			System.out.println(wbs.getText());
		}
	}
}
