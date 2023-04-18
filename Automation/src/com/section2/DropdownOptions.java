package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOptions 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('username').value = 'admin';");
		jse.executeScript("document.getElementsByName('pwd')[0].value = 'manager';");
		jse.executeScript("document.getElementById('loginButton').click();");	
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
		
		WebElement dd = driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		Select s = new Select(dd);
		List<WebElement> wb = s.getOptions();
		for(WebElement wbs:wb)
		{
			System.out.println(wbs.getText());
		}
	}

}
