package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage 
{
	//declaration
	@FindBy(name = "username")
	private WebElement usernameTB;
	
	@FindBy(name = "password")
	private WebElement passworTBd;
	
	@FindBy(name = "login")
	private WebElement loginBN;
	
	@FindBy(xpath = "//a[text() = 'Back to home']")
	private WebElement backToHomeLink;
	
	//initialization
	public AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public WebElement getUsernameTB() 
	{
		return usernameTB;
	}

	public WebElement getPassworTBd()
	{
		return passworTBd;
	}

	public WebElement getLoginBN() 
	{
		return loginBN;
	}
	
	
	public WebElement getBackToHomeLink()
	{
		return backToHomeLink;
	}

	//logic
	public void clickOnBackToHomeLink()
	{
		backToHomeLink.click();
	}
	//buissness library
	public void LoginToAdmin(String username,String password)
	{
		usernameTB.sendKeys(username);
		passworTBd.sendKeys(password);
		loginBN.click();	
	}
}
