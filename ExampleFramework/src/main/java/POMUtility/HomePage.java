package POMUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(id="logoutLink")
	private WebElement logoutBN;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getLogoutBN() 
	{
		return logoutBN;
	}
	public void clickOnLogoutBN()
	{
		logoutBN.click();
	}
}
