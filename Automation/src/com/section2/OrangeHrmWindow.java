package com.section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindow 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		driver.findElement(By.cssSelector("[alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.cssSelector("[alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.cssSelector("[alt='OrangeHRM on youtube']")).click();
		Set<String> allid = driver.getWindowHandles();
		for(String id : allid)
		{
			String title = driver.switchTo().window(id).getTitle();
			if(!(title.contains("OrangeHRM Inc - YouTube")))
			{
				driver.close();
			}
			else		
			{
				System.out.println(title);
			}
		}
	}

}
