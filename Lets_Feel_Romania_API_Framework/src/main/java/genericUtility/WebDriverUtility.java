package genericUtility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void waitForPageToLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void elementToBeVisible(WebDriver driver,WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
	
	public void scroll(WebDriver driver,int x,int y)
	{
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy("+x+","+y+");");   
	}
	   
	public void scroll(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void acceptAlertPopup(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}
	   
	public void cancelAlertPopup(WebDriver driver)
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}
	public void getScreenshot(WebDriver driver,String screenshotName) throws Throwable
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("./screenshot/"+screenshotName+".png");
		FileUtils.copyFile(src, trg);
	}
	   
	public void closeBrowser(WebDriver driver)
	{
	   driver.close();
	}
}
