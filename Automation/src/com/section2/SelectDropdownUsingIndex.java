package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownUsingIndex 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("file:///D:/Anchu/selenium/Dropdown.html");
		WebElement wb = driver.findElement(By.id("Anusha Suvarna"));
		Select s = new Select(wb);
		
		//By using selectByIndex method
		//s.selectByIndex(1);
		
		//By using selectByValue method
		//s.selectByValue("4");
		
		//By using selectByVisibletext
		s.selectByVisibleText("Saarathi");
		
		//getting all options from dropdown
		List<WebElement> webele = s.getOptions();
		for(WebElement web : webele)
		{
			System.out.println(web.getText());
		}
		
		//checking whether it is single select dropdown or multiselect
		if(s.isMultiple())
			System.out.println("Multiselect dropdown");
		else
			System.out.println("Single select dropdown");
	}

}
