package TYSS;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet 
{

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'From']/../div[2]/input")).sendKeys("Mang");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'Ajmer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-March-2023']/div[3]/div/div[@data-testid=\"undefined-calendar-day-14\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text() = 'Return Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid=\"undefined-month-April-2023\"]/div[3]/div/div[@data-testid=\"undefined-calendar-day-23\"]")).click();
		driver.findElement(By.xpath("//div[@class=\"css-1dbjc4n r-1awozwy r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-1g94qm0 r-1w50u8q r-ah5dr5 r-1otgn73\"]")).click();
	}

}
