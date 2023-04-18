import org.openqa.selenium.By;
import org.testng.annotations.Test;

import GenericUtilities.BaseClass;

public class Demo extends BaseClass
{
	@Test
	public void m()
	{
		String msg = driver.findElement(By.xpath("//td[text() = 'Enter Time-Track']")).getText();
		System.out.println(msg);
	}
}
