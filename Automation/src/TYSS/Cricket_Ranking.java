package TYSS;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Cricket_Ranking 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
//		List<WebElement> teams = driver.findElements(By.xpath("//tbody/tr/td[2]/span[2]"));
//		List<WebElement> points = driver.findElements(By.xpath("//tbody/tr/td[4]"));
//		for(int i=0;i<teams.size();i++)
//		{
//			System.out.println(teams.get(i).getText()+" = "+points.get(i).getText());
//		}
		//count no. of rows
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		Iterator<WebElement> itr = rows.iterator();
		int count = 0;

		while(itr.hasNext())
		{
			System.out.println(itr.next().getText());
			count++;
		}
		System.out.println(count);
		
		//count no. of columns in table
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		Iterator<WebElement> itr2 = columns.iterator();
		int count1 = 0;
		while(itr2.hasNext())
		{
			System.out.println(itr2.next().getText());
			count1++;
		}
		System.out.println(count1);
		
		//print first 5rows from table
		for(int i=0;i<5;i++)
		{
			System.out.println(rows.get(i).getText());
		}
		
		//print last row
		String lastrow = driver.findElement(By.xpath("(//tbody/tr)[last()]")).getText();
		System.out.println("Lastrow "+lastrow);
		
		//print only team names
		List<WebElement> teams = driver.findElements(By.xpath("//span[@class='u-hide-phablet']"));
		for(WebElement team:teams)
		{
			System.out.println(team.getText());
		}
		
		//print all matches
		List<WebElement> matches = driver.findElements(By.xpath("//span[@class='u-hide-phablet']/../following-sibling::td[1]"));
		for(WebElement match:matches)
		{
			System.out.println(match.getText());
		}
		//print country name with matches
		for(int i=0;i<count;i++)
		{
			System.out.print(teams.get(i).getText());
			System.out.print("---->");
			System.out.println(matches.get(i).getText());
		}
		
		//printing rows count and columns count
		
		System.out.println(columns.size());
		System.out.println(rows.size());
	}
}


