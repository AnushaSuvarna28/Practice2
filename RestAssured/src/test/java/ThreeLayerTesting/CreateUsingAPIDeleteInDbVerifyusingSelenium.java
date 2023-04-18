package ThreeLayerTesting;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import GenericUtility.BaseClass;
import GenericUtility.EndPointsLibrary;
import GenericUtility.JavaLibrary;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectPage;
import PojoClass.genericUtility.CreateProjectPage;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateUsingAPIDeleteInDbVerifyusingSelenium extends BaseClass
{
	//(selenium not done)
	JavaLibrary jlib = new JavaLibrary();
	String pname = "Parashurama"+jlib.getRandomNumber();
	@Test
	public void createPackage() throws SQLException
	{
		CreateProjectPage cp = new CreateProjectPage("Anchu",pname,"Ongoing","4");
		Response res = given().spec(reqs).body(cp).contentType(ContentType.JSON)
		.when().post(EndPointsLibrary.createProject);
		System.out.println("djfdjlsfd");
		res.then().assertThat().statusCode(201).log().all();
		String pid = res.jsonPath().get("projectId");
		
		//delete the created project in database
		String query = "delete from project where project_Id='"+pid+"'";
		dlib.deleteDataFromDb(query);
		
		//validate in gui
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://rmgtestingserver:8084/welcome");	
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra",Keys.TAB,"rmgy@9999",Keys.ENTER);
//		driver.findElement(By.linkText("Projects")).click();
		
		HomePage hp = new HomePage(driver);
		hp.clickProjectsTAB();
		List<WebElement> projects = driver.findElements(By.xpath("//tbody/tr/td[2]"));
		boolean flag=false;
		for(WebElement project:projects)
		{
			String projectname = project.getText();
			if(projectname.equalsIgnoreCase(pname)) 
			{
			flag=true;
			break;
			}
		}
		Assert.assertFalse(flag);
		System.out.println("Project is deleted in gui");
	}
}
