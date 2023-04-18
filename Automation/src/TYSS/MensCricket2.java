package TYSS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MensCricket2 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	    
	    List<WebElement> teamdetail = driver.findElements(By.xpath("//tbody/tr"));
	    for(WebElement team : teamdetail)
	    {
	    	System.out.println(team.getText());
	    }

	}

}
