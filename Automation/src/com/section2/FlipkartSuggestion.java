package com.section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSuggestion 
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text() = '✕']")).click();
	driver.findElement(By.name("q")).sendKeys("nokia");
	//List<WebElement> suggestions = driver.findElements(By.cssSelector("._1MRYA1>[class ='Y5N33s']>div>[class ='_3izBDY']>[class='lrtEPN _17d0yO']"));
	List<WebElement> suggestions = driver.findElements(By.xpath("//form[@method=\"GET\"]/ul[1]/li"));
	for(WebElement sugg : suggestions)
	{
		System.out.println(sugg.getText());
	}
	}

}
