package com.section2;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

public class Naukri 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/recommendedjobs");
		
		//move cursor over jobs
		WebElement jobs = driver.findElement(By.xpath("//ul[@class=\"nI-gNb-menus\"]/li[1]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(jobs).perform();
		
		//click on IT jobs
		driver.findElement(By.xpath("//div[text() = 'IT jobs']")).click();
		
		//Thread.sleep(2000);
		//click on first job
		driver.findElement(By.xpath("//div[@class=\"list\"]/article[1]/div[1]/div[1]/a")).click();
		
		//change focus to new tab
		String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for(String id : allid)
		{
			if(!(id.equals(mainid)))
			{
				driver.switchTo().window(id);
			}
		}
		
		//scroll down 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,50000);");
		
		//take screenshot of connect with us		
		WebElement connectwithus = driver.findElement(By.className("nI-gNb-followus"));
		File src = connectwithus.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/google.png");
		FileUtils.copyFile(src, trg);
		
		//click on privacy policy
		driver.findElement(By.linkText("Privacy policy")).click();
		
		//get title of privacy policy page
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
