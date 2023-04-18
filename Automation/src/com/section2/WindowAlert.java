package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowAlert 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 256 GB)']")).click();
		String frstwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for(String id:allwindows)
		{
			if(!(id.equals(frstwindow)))
			{
				driver.switchTo().window(id);
			}
		}
		//String price = driver.findElement(By.xpath("//div[@class = 'CEmiEU']/div/div")).getText();
		//System.out.println(price);
		Thread.sleep(2000);
		driver.close();
		//driver.switchTo().window(frstwindow);
		String title = driver.getTitle();
		System.out.println(title);
	}

}
