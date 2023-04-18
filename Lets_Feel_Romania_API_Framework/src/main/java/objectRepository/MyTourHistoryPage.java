package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyTourHistoryPage 
{
	@FindBy(xpath = "//td[text() = '#BK362']/../descendant::td[text() = 'Cancelled']")
	private WebElement canceled;
	
	public MyTourHistoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCanceled() 
	{
		return canceled;
	}
	public String getCanceledText()
	{
		String msg = canceled.getText();
		return msg;
	}
	

}
