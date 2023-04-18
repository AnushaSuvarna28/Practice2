package com.section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		driver.findElement(By.xpath("//div[@id ='navbarSupportedContent']/div[2]/ul[1]/li[2]/a/button")).click();
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("Anusha Suvarna");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("8105342878");
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("anusha@gmail.com");
		WebElement wb = driver.findElement(By.id("Form_getForm_Country"));
		Select s = new Select(wb);
		s.selectByValue("India");
		WebElement wb2 = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		Select s1 = new Select(wb2);
		s1.selectByValue("101 - 150");
		driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("Software Engineer");
		driver.findElement(By.id("Form_getForm_Comment")).sendKeys("asdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazxcxvcbgh");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("document.getElementsByClassName('recaptcha-checkbox-border').click();");
		jse.executeScript("document.getElementsByName('action_submitForm')[0].click();");
		
	

	}

}
