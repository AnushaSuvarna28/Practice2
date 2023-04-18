package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionHandling 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","D:\\project\\chromedriver_win32.zip\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("anusha");
		List<WebElement> anusha = driver.findElements(By.xpath("//div[@class=\"mkHrUc\"]/ul[1]/div[1]/ul/li"));
		for(WebElement wb : anusha)
		{
			System.out.println(wb.getText());
		}
	}

}
