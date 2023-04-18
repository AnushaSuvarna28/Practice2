package ThreeLayerTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import GenericUtility.BaseClass;
import GenericUtility.EndPointsLibrary;
import GenericUtility.JavaLibrary;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectPage;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreatePackageInGUIVerifyInAPIAndDb extends BaseClass
{
	//passed - 3
	JavaLibrary jlib = new JavaLibrary();
	String pname = "Parashurama"+jlib.getRandomNumber();
	@Test
	public void createPackage() throws InterruptedException, SQLException
	{
		HomePage hp = new HomePage(driver);
		hp.clickProjectsTAB();
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnCreateProjectBN();
		pp.createProject(pname,"Anusha_Suvarna","Created");;
		System.out.println("Project created successfully in gui");
	
		String query = "select * from project where created_By='Anusha_Suvarna';";
		String actData = dlib.redDataFromDbAndValidate(query,4,pname);
		Assert.assertEquals(actData,pname);
		System.out.println("Verified in db");
		
		Response projects = given().spec(reqs).when().get(EndPointsLibrary.getAllProject);
		rlib.getJsonDatas(projects,"projectName",pname);
	}
}
