package TYSS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MensCricket 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	    List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/descendant::span[2]"));
	    
	    //printing team name and count of teams
	    int count = 0;
	    for(WebElement team : teams)
	    {
	    	System.out.println(team.getText());
	    	count++;
	    }
	    System.out.println(count);
	}

}
