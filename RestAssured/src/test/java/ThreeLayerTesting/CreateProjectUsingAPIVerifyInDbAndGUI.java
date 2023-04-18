package ThreeLayerTesting;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;
import java.util.List;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.EndPointsLibrary;
import ObjectRepository.HomePage;
import PojoClass.genericUtility.CreateProjectPage;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProjectUsingAPIVerifyInDbAndGUI extends BaseClass
{
	//Passed = 1
	@Test
	public void createProject() throws SQLException, InterruptedException
	{
	CreateProjectPage cp = new CreateProjectPage("Anusha", "CCM"+jlib.getRandomNumber(),"completed", "4");
	
	//send the request
	Response res = given().spec(reqs).body(cp)
	.when().post(EndPointsLibrary.createProject);
	
	//capture the projectId
	String expData = rlib.getJsonData(res,"projectId");
	
	res.then().spec(resp).log().all();
	
	//validate the id in database
	String query = "select * from project where project_Id='expData';";
	String actData = dlib.redDataFromDbAndValidate(query,1,expData);
	
	Assert.assertEquals(expData,actData);
	System.out.println("TC is passed in database");
	
	HomePage hp = new HomePage(driver);
	hp.clickProjectsTAB();
	
	List<WebElement> pids = driver.findElements(By.xpath("//tbody/tr/td[1]"));
	boolean flag=false;
	for(WebElement pid:pids)
	{
		String projectid = pid.getText();
		if(expData.equalsIgnoreCase(projectid)) 
		{
		flag=true;
		break;
		}
	}
	Assert.assertTrue(flag);
	System.out.println("TC is passed in GUI");
	}
}
