package POMUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="username")
	private WebElement usernameTB;
	
	@FindBy(name = "pwd")
	private WebElement passwordTB;
	
	@FindBy(id = "loginButton")
	private WebElement loginBN;
	
	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getUsernameTB() 
	{
		return usernameTB;
	}
	public WebElement getPasswordTB() 
	{
		return passwordTB;
	}
	public WebElement getLoginBN() 
	{
		return loginBN;
	}
	public void loginToAplctn(String username,String password)
	{
		usernameTB.sendKeys(username);
		passwordTB.sendKeys(password);
		loginBN.click();
	}
}
