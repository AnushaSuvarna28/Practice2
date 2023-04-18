package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePackagePage 
{
	//declaration
	@FindBy(xpath = "//th[text() = 'Action']/../../../tbody/descendant::span[text() = '2']/../../td[@data-th='Action']")
	private WebElement viewDetails;
	
	//initialization
	public ManagePackagePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	public WebElement getViewDetails()
	{
		return viewDetails;
	}
	
	//logic
	public void clickOnViewDetails()
	{
		viewDetails.click();
	}
}
