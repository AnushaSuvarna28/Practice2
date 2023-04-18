package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.WebDriverUtility;

public class CreatePackagePage 
{
	WebDriverUtility wu = new WebDriverUtility();
	WebDriver driver;
	@FindBy(name = "packagename")
	private WebElement packageNameTB;
	
	@FindBy(name = "packagetype")
	private WebElement packagetypeTB;
	
	@FindBy(name = "packagelocation")
	private WebElement packagelocationTB;
	
	@FindBy(name = "packageprice")
	private WebElement packagepriceTB;
	
	@FindBy(name = "packagefeatures")
	private WebElement packagefeaturesTB;
	
	@FindBy(name = "packagedetails")
	private WebElement packagedetailsTB;
	
	@FindBy(name = "packageimage")
	private WebElement packageimageTB;
	
	@FindBy(name = "submit")
	private WebElement createBN;
	
	//initialization
	public CreatePackagePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPackageNameTB() 
	{
		return packageNameTB;
	}

	public WebElement getPackagetypeTB() 
	{
		return packagetypeTB;
	}

	public WebElement getPackagelocationTB() 
	{
		return packagelocationTB;
	}

	public WebElement getPackagepriceTB() 
	{
		return packagepriceTB;
	}

	public WebElement getPackagefeaturesTB() 
	{
		return packagefeaturesTB;
	}

	public WebElement getPackagedetailsTB() 
	{
		return packagedetailsTB;
	}

	public WebElement getPackageimageTB() 
	{
		return packageimageTB;
	}

	public WebElement getCreateBN() 
	{
		return createBN;
	}
	//business library
	public void createPackage(String packagename,String packagetype,String packagelocation,String packageprice,String packagefeatures,String packagedetails)
	{
		packageNameTB.sendKeys(packagename);
		packagetypeTB.sendKeys(packagetype);
		packagelocationTB.sendKeys(packagelocation);
		packagepriceTB.sendKeys(packageprice);
		packagefeaturesTB.sendKeys(packagefeatures);
		packagedetailsTB.sendKeys(packagedetails);
		wu.scroll(driver, 0, 300);
		createBN.click();
	}
	
}
