//goto orangehrm click on linkedin, fb and then click on youtube and then keep only youtube and fetch the title and close all other tabs
package com.section2;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopup 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//div[@id='social-icons']/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='social-icons']/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='social-icons']/a[4]")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id : allid)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if((title.contains("YouTube")))
			{
				System.out.println(title);
			}
			else
			{
				driver.close();
			}
		}
	}

}
