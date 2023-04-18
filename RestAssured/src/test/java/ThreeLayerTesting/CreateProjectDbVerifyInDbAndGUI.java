package ThreeLayerTesting;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

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
import io.restassured.response.Response;

public class CreateProjectDbVerifyInDbAndGUI extends BaseClass
{
	//Passed 4 
	JavaLibrary jlib = new JavaLibrary();
	String id = "PK"+jlib.getRandomNumber();
	String projectname = "PMS"+jlib.getRandomNumber();
	@Test
	public void createProject() throws SQLException
	{
		String query = "insert into project values('"+id+"','Anusha Suvarna','02-03-23','"+projectname+"','created',3);";
		dlib.insertDataToDb(query);
	
		HomePage hp = new HomePage(driver);
		hp.clickProjectsTAB();
			List<WebElement> projects = driver.findElements(By.xpath("//tbody/tr/td[2]"));
			boolean flag=false;
			for(WebElement project:projects)
			{
				String pname = project.getText();
				if(pname.equalsIgnoreCase(projectname)) 
				{
				flag=true;
				break;
				}
			}
			Assert.assertTrue(flag);
			System.out.println("Project is found in gui");

			Response res = given().spec(reqs).when().get(EndPointsLibrary.getAllProject);
			rlib.getJsonDatas(res,"projectName",projectname);
		}
	}
