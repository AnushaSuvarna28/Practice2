package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rpathg 
{
	ChromeDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		rpathg rp = new rpathg();
		Random r = new Random();
		int num = r.nextInt(1000);
		String aname = "Anusha";
		aname = aname + num;
		rp.launchBrowser();
		rp.login();
		Thread.sleep(2000);
		String ename = rp.customerCreation(aname);
		Thread.sleep(2000);
		if(aname.equals(ename))
		{
			System.out.println("TC is passed");
		}
		else
		{
			System.out.println("TC is failed");
		}
		rp.closeBrowser();
	}
		public void launchBrowser() 
		{
			System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		public void login()
		{
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("keepLoggedInLabel")).click();
			driver.findElement(By.id("loginButton")).click();
		}
		public String customerCreation(String aname) throws InterruptedException
		{
			driver.findElement(By.id("container_tasks")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".title.ellipsis")).click();
			driver.findElement(By.className("createNewCustomer")).click();
			Thread.sleep(20000);
			driver.findElement(By.className("newNameField")).sendKeys(aname);
			driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("description of the name");
			driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
			Thread.sleep(2000);
			String ename = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
			System.out.println(ename);
			return ename;
		}
		public void closeBrowser()
		{
			driver.close();
		}
}
