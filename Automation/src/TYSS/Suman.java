package TYSS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suman 
{
	public static void main(String[]arg) throws Throwable
	{
		String from="agra";
		String to="delhi";
		String dat = "20 Dec 2023"; //(July,Sept,rest like Jan)
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//label[.='FROM']/../input")).sendKeys(from);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[1]")).click();
		driver.findElement(By.xpath("//label[.='TO']/../input")).sendKeys(to);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[1]")).click();
		
		driver.findElement(By.xpath("//div[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		
		String[] date = dat.split(" ");
		String cdate=date[0];
		String month = date[1];
		String currm = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
		System.out.println(currm);
		String[] currentmth=currm.split(" ");
		String currentmonth=currentmth[0];
		System.out.println(currentmonth);
		boolean res = currentmonth.equals(month);

			while(res==false)
			{
			driver.findElement(By.xpath("//td[@class='next']")).click();
			String currmup = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText(); 
			String[] currmm=currmup.split(" ");
			String upmonth=currmm[0];
			System.out.println(upmonth);
			//currm=upmonth;
			//System.out.println(currm);
			if(upmonth.equals(month))
				res=true;
			else
				res=false;
			}
			driver.findElement(By.xpath("//td[.='"+cdate+"']")).click();
		
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();
	}


}
