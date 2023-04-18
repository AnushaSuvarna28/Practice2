package projectName.testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import projectName.genericLib.BaseClass;
import projectName.genericLib.CommonUtility;

public class AlertPopup extends BaseClass
{
	@Test
	public void alertPopup() throws EncryptedDocumentException, IOException
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text() = 'Create Type of Work']")).click();
		driver.findElement(By.name("name")).sendKeys("afhgdfja");
		driver.findElement(By.xpath("//form[@name=\"BillingTypeModifyForm\"]/table/tbody/tr[7]/td/input[2]")).click();
		CommonUtility cu = new CommonUtility();
		String msg = cu.getAlertMsg(driver);
		System.out.println(msg);
		cu.getAlertCancel(driver);
	}
}
