package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath = "//a[text() = 'Projects']")
	private WebElement projectsTAB;
	
	@FindBy(xpath = "//a[text() = 'Logout']")
	private WebElement logoutBN;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getProjectsTAB()
	{
		return projectsTAB;
	}
	public WebElement getLogoutBN() 
	{
		return logoutBN;
	}
	public void clickLogoutBN()
	{
		logoutBN.click();
	}
	public void clickProjectsTAB()
	{
		projectsTAB.click();
	}
	
}
