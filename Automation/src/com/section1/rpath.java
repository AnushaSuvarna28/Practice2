package com.section1;

import java.time.Duration;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rpath {

	public static void main(String[] args) throws InterruptedException 
	{
		Random r = new Random();
		int num = r.nextInt(1000);
		String aname="Anusha";
		aname=aname + num;
		//launch
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		//login
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("keepLoggedInLabel")).click();
		driver.findElement(By.id("loginButton")).click();
		//task
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(aname);
		driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("dffg");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		String ename = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(ename);
		if(aname.equals(ename))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}

	}

}
