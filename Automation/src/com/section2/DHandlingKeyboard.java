package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DHandlingKeyboard 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		Point p = driver.manage().window().getPosition();
		System.out.println(p);
		driver.manage().window().setPosition(new Point(-2000,0));
		/*JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('username').value = 'admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value = 'manager';");
		jse.executeScript("document.getElementById('loginButton').click();");	
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
		WebElement dd = driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		dd.click();
		//By using Keyboard Stroke
		//dd.sendKeys(Keys.ARROW_DOWN);
		//dd.sendKeys(Keys.ARROW_DOWN);
		//dd.sendKeys(Keys.ARROW_DOWN);
		//dd.sendKeys(Keys.ENTER);
		
		//By using normal findelement approach
		driver.findElement(By.xpath("//option[text() ='Product Line']")).click();
		dd.click();*/
	}

}
