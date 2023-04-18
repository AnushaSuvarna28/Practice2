package ThreeLayerTesting;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

import GenericUtility.BaseClass;
import GenericUtility.JavaLibrary;
import ObjectRepository.HomePage;
import ObjectRepository.ProjectPage;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateInGUIVerifyInDbDeleteUsingAPI extends BaseClass
{
	//Passed - 2
	String pname = "SitaRamam"+jlib.getRandomNumber();
	@Test
	public void createPackage() throws InterruptedException, SQLException
	{
		HomePage hp = new HomePage(driver);
		hp.clickProjectsTAB();
		
		ProjectPage pp = new ProjectPage(driver);
		pp.clickOnCreateProjectBN();
		
		pp.createProject(pname, "Anusha_Suvarna","Completed");
		
		String expPid = driver.findElement(By.xpath("//tr/td[2][.='"+pname+"']/../td[1]")).getText();

		String query = "select * from project;";
		String actData = dlib.redDataFromDbAndValidate(query,1,expPid);
		Assert.assertEquals(expPid,actData);

		given().spec(reqs)
		.when().delete("/projects/"+expPid+"")
		.then().assertThat().statusCode(204).log().all();
	}
}
