package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminHomePage 
{
  //declaration
  @FindBy(xpath = "//span[text() = 'Dashboard']")
  private WebElement dashboardTab;
  
  @FindBy(xpath = "//span[contains(text(),' Tour Packages')]")
  private WebElement tourPackagesTab;
  
  @FindBy(xpath = "//span[text() = 'Manage Users']")
  private WebElement manageUsersTab;
  
  @FindBy(xpath = "//span[text() = 'Manage Booking']")
  private WebElement manageBookingTab;
  
  @FindBy(xpath = "//span[text() = 'Manage Issues']")
  private WebElement manageIssuesTab;
  
  @FindBy(xpath = "//span[text() = 'Manage Enquiries']")
  private WebElement manageEnquiriesTab;
  
  @FindBy(xpath = "//span[text() = 'Manage Pages']")
  private WebElement managePagesTab;
  
  @FindBy(xpath = "//a[text() = 'Create']")
  private WebElement createTab;
  
  @FindBy(xpath = "//a[text() = 'Manage']")
  private WebElement manageTab;
  
  @FindBy(xpath= "//i[@class = 'fa fa-angle-down']")
  private WebElement downArrow;
  
  @FindBy(xpath="//a[text() = ' Logout']")
  private WebElement logoutBN;
  
  //initialization
  public AdminHomePage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
  
 //utilization
  public WebElement getDashboardTab() 
  {	
	return dashboardTab;
  }

	public WebElement getTourPackagesTab() 
  {
	return tourPackagesTab;
  }

  public WebElement getManageUsersTab() 
  {
	return manageUsersTab;
  }

  public WebElement getManageBookingTab() 
  {
	return manageBookingTab;
  }

  public WebElement getManageIssuesTab() 
  {
	return manageIssuesTab;
  }

  public WebElement getManageEnquiriesTab() 
  {
	return manageEnquiriesTab;
  }

  public WebElement getManagePagesTab() 
  {
	return managePagesTab;
  }
  
  public WebElement getCreateTab() 
  {
	return createTab;
  }
  
  public WebElement getmanageTab() 
  {
	return manageTab;
  }
  
public WebElement getDownArrow()
{
	return downArrow;
}

public WebElement getLogoutBN() 
{
	return logoutBN;
}

//business library
  public void clickOnDashboardTab()
  {
	  dashboardTab.click();
  }
  
  public void clickOnTourPackagesTab()
  {
	  tourPackagesTab.click();
  }

  public void clickOnManageBookingTab()
  {
	  manageBookingTab.click();
  }
  
  public void clickOnManageIssuesTab()
  {
	  manageUsersTab.click();
  }
  
  public void clickOnManageEnquiriesTab()
  {
	  manageEnquiriesTab.click();
  }
  
  public void clickOnManagePagesTab()
  {
	  managePagesTab.click();
  }
  
  public void clickOnCreatetab()
  {
	  createTab.click();
  }
  public void clickOnManagetab()
  {
	  manageTab.click();
  }
  public void clickOnDownArrow()
  {
	  downArrow.click();
  }
  public void clickOnLogoutLink()
  {
	  logoutBN.click();
  }
}
