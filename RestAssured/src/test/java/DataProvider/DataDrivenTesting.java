package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import POJOClassForSerializationAndDeserialization.POJOClassPost;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataDrivenTesting 
{
	@Test(dataProvider = "getData")
	public void ddt(String c,String p,String s,String t)
	{
		//precondition
		JavaLibrary jlib = new JavaLibrary();
		baseURI = "http://rmgtestingserver";
		port = 8084;
		POJOClassPost pobj = new POJOClassPost(c,p+jlib.getRandomNumber(),s,t);
		given().body(pobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[4][4];
		obj[0][0] = "A";
		obj[0][1] = "Chennai Express";
		obj[0][2] = "Completed";
		obj[0][3] ="3";
		
		obj[1][0] = "B";
		obj[1][1] = "Don2";
		obj[1][2] = "Completed";
		obj[1][3] ="3";
		
		obj[2][0] = "C";
		obj[2][1] = "Happy New Year";
		obj[2][2] = "Completed";
		obj[2][3] ="3";
		
		obj[3][0] = "D";
		obj[3][1] = "Rabne Banadi Jodi";
		obj[3][2] = "Completed";
		obj[3][3] ="3";
		return obj;
	}
}
