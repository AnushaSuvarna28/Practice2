package projectName.testScript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import projectName.genericLib.BaseClass;
import projectName.genericLib.CommonUtility;
import projectName.genericLib.DataUtility;
@Listeners(projectName.genericLib.ListnerImplementation.class)
public class CustomerCreation extends BaseClass
{
	@Test
	public void customerCreation() throws EncryptedDocumentException, IOException
	{
		CommonUtility cu = new CommonUtility();
		int num = cu.getRandomNumber(1000);
		String expcname = du.getDataFromExcelsheet("Sheet1", 4, 0);
		expcname = expcname+num;
		//task
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		driver.findElement(By.className("newNameField")).sendKeys(expcname);
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), expcname));
		String actualcname = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actualcname);
	}

}
