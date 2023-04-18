package TYSS;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MensCricket3 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
	   
	    //fetch the first team detail
	    List<WebElement> fullrow = driver.findElements(By.xpath("//tr[@class=\"rankings-block__banner\"]"));
	    for(WebElement row : fullrow)
	    {
	    	System.out.println(row.getText());
	    }
	    
	    
	    //total column count 
	    int colcount = 0;
	    List<WebElement> cols = driver.findElements(By.xpath("//tr[@class=\"rankings-block__banner\"]/td"));
	    for(WebElement col:cols)
	    {
	    	colcount++;
	    }
	    System.out.println(colcount);
	    
	    for(int i=0;i<=5;i++)
	    {
	    	String country = driver.findElement(By.xpath("(//span[@class=\"u-hide-phablet\"])[i]")).getText();
	    	System.out.println(country);
	    }
	}

}
