package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaVirusg 
{
	ChromeDriver driver;
	public static void main(String[] args) 
	{
		CoronaVirusg c = new CoronaVirusg();
		c.launchBrowser();
		String cases = c.coronaCases();
		System.out.println("Total corona cases"+cases);
		String death = c.deathCases();
		System.out.println("Death  "+death);
		String recovered = c.recoveredCases();
		System.out.println("Recovered  "+recovered);
		c.closeBrowser();

	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
	}
	public String coronaCases()
	{
		String cases = driver.findElement(By.xpath("//h1[text() = 'Coronavirus Cases:']/../div/span")).getText();
		return cases;
	}
	public String deathCases()
	{
		String death=driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
		return death;
	}
	public String recoveredCases()
	{
		String recovered = driver.findElement(By.xpath("//h1[text() = 'Recovered:']/../div/span")).getText();
		return recovered;
	}
	public void closeBrowser()
	{
		driver.close();
	}

}
