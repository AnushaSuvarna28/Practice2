package TYSS;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		Actions act = new Actions(driver);
		WebElement intercept = driver.findElement(By.xpath("//p[text() = 'Login or Create Account']"));
		act.moveToElement(intercept).click().perform();
		
		//click on from and select a place
		driver.findElement(By.xpath("//span[text() = 'From']")).click();
		driver.findElement(By.xpath("//p[text() = 'Bengaluru, India']")).click();
		
		//click on to and select a place 
		driver.findElement(By.xpath("//span[text() = 'To']")).click();
		driver.findElement(By.xpath("//p[text() = 'Mumbai, India']")).click();
		
		try
		{
	    driver.findElement(By.xpath("//div[@aria-label='Mon Jun 12 2023']")).click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			driver.findElement(By.xpath("//div[@aria-label='Mon Jun 12 2023']")).click();
		}
	}

}
