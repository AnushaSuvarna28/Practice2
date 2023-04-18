package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DefaultHomePage 
{
	//declaration
	@FindBy(xpath = "//a[text() = 'Admin Login']")
	private WebElement adminLoginLink;
	
	@FindBy(xpath = "//a[text() = 'Sign Up']")
	private WebElement signUpLink;
	
	@FindBy(xpath = "//a[text() = '/ Sign In']")
	private WebElement signInLink;
	
	//initialization
	public DefaultHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getAdminLoginLink() 
	{
		return adminLoginLink;
	}

	public WebElement getSignUpLink() 
	{
		return signUpLink;
	}

	public WebElement getSignInLink() 
	{
		return signInLink;
	}
	
	//business library
	public void clickOnAdminLink()
	{
		adminLoginLink.click();
	}
	public void clickOnSignUpLink()
	{
		signUpLink.click();
	}
	public void clickOnSignInLink()
	{
		signInLink.click();
	}
}
