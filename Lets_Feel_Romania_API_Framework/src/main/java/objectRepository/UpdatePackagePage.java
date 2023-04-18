package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatePackagePage 
{
	//declaration
	@FindBy(xpath = "//button[text() = 'Update']")
	private WebElement updateBN;
	
	//initialization
	public UpdatePackagePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getUpdateBN() 
	{
		return updateBN;
	}

	public void clickOnUpdateButton()
	{
		updateBN.click();
	}
	
}
