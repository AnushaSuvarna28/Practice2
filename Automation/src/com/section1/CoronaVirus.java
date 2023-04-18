package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronaVirus {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.worldometers.info/coronavirus/");
		String cases = driver.findElement(By.xpath("//h1[text() = 'Coronavirus Cases:']/../div/span")).getText();
		System.out.println("Total corona cases"+cases);
		String death=driver.findElement(By.xpath("//h1[text()='Deaths:']/../div/span")).getText();
		System.out.println("Death"+death);
		String recovered = driver.findElement(By.xpath("//h1[text() = 'Recovered:']/../div/span")).getText();
		System.out.println("Recovered"+recovered);
	}

}
  