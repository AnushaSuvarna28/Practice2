package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class ProjectPage 
{
	@FindBy(xpath = "//span[text() = 'Create Project']")
	private WebElement createProjectBN;
	
	@FindBy(xpath = "//input[@name='projectName']")
	private WebElement projectName;
	
	@FindBy(xpath = "//input[@name = 'createdBy']")
	private WebElement projectManager;
		
	@FindBy(xpath = "//label[@class='col-sm-2 col-form-label']/../select")
	private WebElement projectStatus;
	
	@FindBy(xpath = "//input[@type = 'submit']")
	private WebElement addProjectBN;
	
	public ProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getProjectName() 
	{
		return projectName;
	}

	public WebElement getProjectManager() 
	{
		return projectManager;
	}

	public WebElement getProjectStatus() 
	{
		return projectStatus;
	}
	
	public WebElement getCreateProjectBN()
	{
		return createProjectBN;
	}
	
	public void createProject(String pname,String pmanager,String text)
	{
		projectName.sendKeys(pname);
		projectManager.sendKeys(pmanager);
		WebDriverUtility wu = new WebDriverUtility();
		wu.getDropdown(text,projectStatus);
		addProjectBN.click();
	}
	
	public void clickOnCreateProjectBN()
	{
		createProjectBN.click();
	}
}
