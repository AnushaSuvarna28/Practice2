package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id = "usernmae")
	private WebElement usernameTB;
	
	@FindBy(id = "inputPassword")
	private WebElement passwordTB;
	
	@FindBy(xpath = "//button[text() = 'Sign in']")
	private WebElement signInBN;
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
	public WebElement getSignInBN()
	{
		return signInBN;
	}
	
	public void loginAplctn(String un,String pwd)
	{
		usernameTB.sendKeys(un);
		passwordTB.sendKeys(pwd);
		signInBN.click();
	}
}
