
package Practice;

import org.json.simple.JSONObject;
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
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CreateProjectUsingAPI 
{
	JavaLibrary jlib = new JavaLibrary();
	String pname = "Parashurama"+jlib.getRandomNumber();
	@Test(priority=1)
	public void create()
	{
		//Create project using API
		baseURI = "http://rmgtestingserver";
		port = 8084;
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", pname);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 3);
		
		Response res = given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject");
		res.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
	@Test(priority=2)
	public void validateproject() throws Throwable
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://rmgtestingserver:8084/welcome");	
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(2000);
		List<WebElement> projects = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		System.out.println(projects.size());
		boolean flag=false;
		for(WebElement project:projects)
		{
			String projectname = project.getText();
			if(projectname.equalsIgnoreCase(pname)) {
			flag=true;
			break;
			}
		}
		Assert.assertTrue(flag,"project not found");
		System.out.println("Project is found");
	}
	@Test(priority=3)
	public void getProject() throws SQLException
	{
		Connection con = null;
		
		try 
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			con =  DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
			Statement state = con.createStatement();
			ResultSet rs = state.executeQuery("select * from project");
			boolean flag = false;
			while(rs.next()) 
			{
				//System.out.println(rs.getString(4));
				try
				{
				if(rs.getString(4).equalsIgnoreCase(pname))
				{
					flag = true;
					System.out.println(rs.getString(4));
					break;
				}
				}
				catch(Exception e)
				{
					
				}
			}
			Assert.assertTrue(flag);
			System.out.println("Project is created successfully");
		}
		catch (Exception e) 
		{
		//e.printStackTrace();
		}
		finally
		{
			con.close();
		}
		}
}
