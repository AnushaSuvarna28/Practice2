package TYSS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
	    
	    driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);
	    
	    driver.findElement(By.xpath("//a[text() = 'Contacts']")).click();
	    
	    driver.findElement(By.xpath("//img[@alt='Create Contact...']")).click();
	    
	    driver.findElement(By.xpath("(//img[@src=\"themes/softed/images/select.gif\"])[1]")).click();
	    
	    Set<String> allid = driver.getWindowHandles();
	    String mainid = driver.getWindowHandle();
	    for(String id:allid)
	    {
	    	String title = driver.switchTo().window(id).getCurrentUrl();
	    	if(title.contains("Accounts&action"))
	    	{
	    		System.out.println(title);
	    		break;
	    	}
	    }
	    driver.findElement(By.id("search_txt")).sendKeys("wipro");
	    driver.findElement(By.name("search")).click();
	    driver.close();
	    driver.switchTo().window(mainid);
	    System.out.println(driver.getTitle());

	}

}
