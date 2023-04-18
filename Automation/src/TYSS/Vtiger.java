package TYSS;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Vtiger
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	    driver.get("http://rmgtestingserver:8888/index.php?action=Login&module=Users");
	    
	    driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.ENTER);
		
	   WebElement setting=  driver.findElement(By.xpath("//span[contains(text() , ' Administrator')]/../following-sibling::td[3]"));
	   Actions act = new Actions(driver);
	   act.moveToElement(setting).perform();
	   
	   driver.findElement(By.xpath("//a[text() = 'CRM Settings']")).click();
	   
	   WebElement workflow = driver.findElement(By.xpath("//a[contains(text(),'Workflows')]"));
	   
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].scrollIntoView(true)",workflow);
	   workflow.click();
	   
	   driver.findElement(By.id("new_workflow")).click();
	   
	   String text = driver.findElement(By.xpath("//td[contains(text() , 'Create workflow')]")).getText();
	   System.out.println(text);
	   
	   driver.findElement(By.id("module_list")).click();
	   }
}
