
package projectName.testScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import projectName.genericLib.BaseClass;

public class HiddenDivisionPopup extends BaseClass
{
	@Test
	public void hiddenDivisionPopup() throws InterruptedException
	{
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//table[@class = 'headerRowTable']/tbody/tr/td")).click();
		
		//explicit wait
		WebElement wb = driver.findElement(By.className("bulkOperationsPanel"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(wb));
		
		driver.findElement(By.cssSelector(".delete.button")).click();
		WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"));
		
		//explicit wait
		wait.until(ExpectedConditions.visibilityOf(msg));
		
		System.out.println(msg.getText());
	}

}
