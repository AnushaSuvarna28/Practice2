package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerHomePage 
{
	//declaration
	@FindBy(linkText = "My Profile")
	private WebElement myProfileLink;
	
	@FindBy(linkText = "Change Password")
	private WebElement changePasswordLink;
	
	@FindBy(linkText = "My Tour History")
	private WebElement myTourHistoryLink;
	
	@FindBy(linkText = "Issue Tickets")
	private WebElement issueTicketsLink;
	
	@FindBy(linkText = "Home")
	private WebElement homeLink;
	
	@FindBy(linkText = "About")
	private WebElement aboutLink;
	
	@FindBy(linkText = "Tour Packages")
	private WebElement tourPackagesLink;
	
	@FindBy(linkText = "Privacy Policy")
	private WebElement privacyPolicyLink;
	
	@FindBy(linkText = "Terms of Use")
	private WebElement termsofUseLink;
	
	@FindBy(linkText = "Contact Us")
	private WebElement contactUsLink;
	
	@FindBy(linkText = " / Write Us ")
	private WebElement  writeUsLink;
	
	@FindBy(xpath = "//a[text() = '/ Logout']")
	private WebElement  logoutLink;
	
	@FindBy(xpath = "//h4[text() = 'Package Name: Lets Feel India']/../following-sibling::div/a[text() = 'Details']")
	private WebElement detailsBN;
	
	//initialization
	public CustomerHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getMyProfileLink() 
	{
		return myProfileLink;
	}

	public WebElement getChangePasswordLink() 
	{
		return changePasswordLink;
	}

	public WebElement getMyTourHistoryLink() 
	{
		return myTourHistoryLink;
	}

	public WebElement getIssueTicketsLink() 
	{
		return issueTicketsLink;
	}

	public WebElement getHomeLink() 
	{
		return homeLink;
	}

	public WebElement getAboutLink() 
	{
		return aboutLink;
	}

	public WebElement getTourPackagesLink() 
	{
		return tourPackagesLink;
	}

	public WebElement getPrivacyPolicyLink()
	{
		return privacyPolicyLink;
	}

	public WebElement getTermsofUseLink() 
	{
		return termsofUseLink;
	}

	public WebElement getContactUsLink() 
	{
		return contactUsLink;
	}

	public WebElement getWriteUsLink() 
	{
		return writeUsLink;
	}
	
	public WebElement getLogoutLink() 
	{
		return logoutLink;
	}

	
	public WebElement getDetailsBN() 
	{
		return detailsBN;
	}

	//logic
	public void clickOnmyProfileLink()
	{
		myProfileLink.click();
	}
	public void clickOnchangePasswordLink()
	{
		changePasswordLink.click();
	}
	public void clickOnmyTourHistoryLink()
	{
		myTourHistoryLink.click();
	}
	public void clickOnissueTicketsLink()
	{
		issueTicketsLink.click();
	}
	public void clickOnhomeLink()
	{
		homeLink.click();
	}
	public void clickOnaboutLink()
	{
		aboutLink.click();
	}
	public void clickOntourPackagesLink()
	{
		tourPackagesLink.click();
	}
	public void clickOnprivacyPolicyLink()
	{
		privacyPolicyLink.click();
	}
	public void clickOntermsofUseLink()
	{
		termsofUseLink.click();
	}
	public void clickOncontactUsLink()
	{
		contactUsLink.click();
	}
	public void clickOnwriteUsLink()
	{
		writeUsLink.click();
	}
	
	public void clickOnlogoutLink()
	{
		logoutLink.click();
	}
	public void clickOnDetailsButton()
	{
		detailsBN.click();
	}
}
