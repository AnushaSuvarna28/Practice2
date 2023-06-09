package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		
		//handling frame using index no.
		//driver.switchTo().frame(0);
		
		//handling using name attribute
		driver.switchTo().frame("iframe_a");
		driver.findElement(By.xpath("//font[text() = 'Free Mock Tests']")).click();
		String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for(String id: allid)
		{
			if(!id.equals(mainid))
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("//nav/div[1]/div/ul/li[4]")).click();
		driver.findElement(By.xpath("(//a[text() = 'RRB NTPC Stage 1'])[1]")).click();
		/*String submain = driver.getWindowHandle();
		for(String id: allid)
		{
			if(!id.equals(submain))
			{
				if(!id.equals(mainid))
				{
				driver.switchTo().window(id);
				}
			}
		}*/
		String title = driver.getTitle();
		System.out.println(title);
	}

}
