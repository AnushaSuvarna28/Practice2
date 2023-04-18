package com.section1;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ExplicitWait 
{
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{
		Random r = new Random();
		int num = r.nextInt(1000);
		String aname="Anusha";
		aname=aname + num;
		
	System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	
	//implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//other ways to open application
	//driver.navigate().to("https://demo.actitime.com/login.do");
	//URL a = new URL("https://demo.actitime.com/login.do");
	//driver.navigate().to(a);
	
	String title1 = driver.getTitle();
	System.out.println(title1);
	
	//perform login 
	driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.ENTER);
	
	
	//click on Tasks
	driver.findElement(By.id("container_tasks")).click();
	
	//click on add new
	driver.findElement(By.cssSelector(".title.ellipsis")).click();
	
	//click on add customer
	driver.findElement(By.cssSelector(".item.createNewCustomer")).click();
	
	//enter customer name
	driver.findElement(By.className("newNameField")).sendKeys(aname);
	
	//enter description
	driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("anusha suvarna");
	
	//click on create customer
	driver.findElement(By.xpath("//div[text() = 'Create Customer']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), aname));
	
	String title = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
	System.out.println(title);
	
	
	}
	

}
