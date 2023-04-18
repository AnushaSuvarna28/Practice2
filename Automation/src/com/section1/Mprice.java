package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mprice 
{
	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException
	{
			Mprice m = new Mprice();
			String pname = "SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)";
			m.launchBrowser();
			m.searchMobile();
			Thread.sleep(2000);
			String price = m.getPrice(pname);
			Thread.sleep(2000);
			System.out.println(price);
			m.closeBrowser();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void searchMobile() throws InterruptedException
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("samsung mobiles");
		driver.findElement(By.className("L0Z3Pu")).click();		
	}
	public String getPrice(String pname)
	{
		String price = driver.findElement(By.xpath("//div[text() = '"+pname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		return price;
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
