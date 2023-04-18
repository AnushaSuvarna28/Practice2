package projectName.testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import projectName.genericLib.BaseClass;
import projectName.genericLib.CommonUtility;

public class DropDown extends BaseClass
{
   @Test
	public void dropdownHandling()
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']/..")).click();
		WebElement dd = driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		String product =  driver.findElement(By.xpath("//option[text() = 'Product']")).getText();  
		dd.click();
		CommonUtility cu = new CommonUtility();
		cu.selectDropdown(dd,product);
		String msg = driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);
	}

}
