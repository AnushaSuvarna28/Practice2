package GenericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility 
{
	public void getDropdown(WebElement dropdown,int index)
	{
		Select s  = new Select(dropdown);
		s.selectByIndex(index);
	}
	public void getDropdown(WebElement dropdown,String value)
	{
		Select s  = new Select(dropdown);
		s.selectByValue(value);
	}
	public void getDropdown(String vtext,WebElement dropdown)
	{
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByVisibleText(vtext);
	}
	
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	public void waitForPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void waitForEleToVisible(WebDriver driver,WebElement wb)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(wb));
	}
}