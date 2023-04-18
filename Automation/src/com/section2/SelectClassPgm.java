package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPgm 
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
		//s.selectByIndex(3);
		//s.selectByValue("2");
		s.selectByVisibleText("Kantara");
		s.selectByVisibleText("Virat");
		List<WebElement> wb1 = s.getOptions();
		for(WebElement wbs : wb1)
		{
			System.out.println(wbs.getText());
		}
		System.out.println(s.isMultiple());
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		for(WebElement options : selectedoptions)
		{
			System.out.println(options.getText());
		}
		System.out.println(s.getFirstSelectedOption().getText());
		//s.deselectByVisibleText("Virat");
		//s.deselectAll();
	}

}
