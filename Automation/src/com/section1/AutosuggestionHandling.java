package com.section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestionHandling 
{
	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("virat");
		List<WebElement> allsuggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/div[1]/ul[1]/li"));
		for(WebElement suggestion : allsuggestions)
		{
			System.out.println(suggestion.getText());
		}
		
	}

}
