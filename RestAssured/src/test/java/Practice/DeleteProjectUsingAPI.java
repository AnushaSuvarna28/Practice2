package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProjectUsingAPI 
{
	String pId = "TY_PROJ_11327";
	@Test(priority=1)
	public void deleteProject() throws SQLException, InterruptedException
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		when().delete("/projects/"+pId+"")
		.then().assertThat().statusCode(204).contentType(ContentType.JSON);
	}
	
	@Test(priority=2)
	public void verifyPackage() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver:8084/welcome");	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
		driver.findElement(By.linkText("Projects")).click();
		List<WebElement> pids = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		//System.out.println(pids.size());
		boolean flag=false;
		for(WebElement pid:pids)
		{
			String projectid = pid.getText();
			if(pId.equalsIgnoreCase(projectid)) 
			{
			flag=true;
			break;
			}
		}
		Assert.assertFalse(flag);
		System.out.println("Project deleted successfully");
	}
	@Test(priority=3)
	public void verifyInDb() throws SQLException
	{
		Connection con = null;
		boolean flag = false;
		try
		{
			//Driver driver = new Driver();
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
			Statement state = con.createStatement();
			ResultSet result = state.executeQuery("select * from project");
			while(result.next())
			{
				if(result.getString(1).equals(pId))
				{
					flag = true;
					break;
				}
			}
			Assert.assertFalse(flag);
			System.out.println("Project is deleted successfully");
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			con.close();
		}
	}
}
