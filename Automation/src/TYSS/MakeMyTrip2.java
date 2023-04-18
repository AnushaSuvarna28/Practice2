package TYSS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\Anchu\\\\selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions act = new Actions(driver);
		WebElement intercept = driver.findElement(By.xpath("//p[text() = 'Login or Create Account']"));
		act.moveToElement(intercept).click().perform();
		
		//click on round trip
		driver.findElement(By.xpath("//li[text() = 'Round Trip']")).click();
		
		//click on from and select a place
		driver.findElement(By.xpath("//span[text() = 'From']")).click();
		driver.findElement(By.xpath("//p[text() = 'Bengaluru, India']")).click();
		
		//click on to and select a place 
		driver.findElement(By.xpath("//span[text() = 'To']")).click();
		driver.findElement(By.xpath("//p[text() = 'Mumbai, India']")).click();
		
		 //click on from date date
        driver.findElement(By.xpath("//div[@aria-label='Wed Feb 15 2023']")).click();
        
        //click on to date
        String amonth = driver.findElement(By.xpath("//div[text() = 'December']")).getText();
        String ayear = driver.findElement(By.xpath("//span[text() = '2022']")).getText();
        
        String expmonth = "December";
        String expyear = "2023";
        String date = "30";
        
        while(!amonth.equals(expmonth)&&ayear.equals(expyear))
        {
        	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
        	amonth = driver.findElement(By.xpath("//div[text() = 'December']")).getText();
            ayear = driver.findElement(By.xpath("//span[text() = '2022']")).getText();
        }
        driver.findElement(By.xpath("(//div[text() = 'December']/../following-sibling::div[@class=\"DayPicker-Body\"]/descendant::p[text() = '27'])[1]")).click();
	}

}
