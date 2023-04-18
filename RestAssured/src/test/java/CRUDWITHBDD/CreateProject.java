package CRUDWITHBDD;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;   //all methods of rest assured are static so

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class CreateProject 
{
	@Test
	public void createProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", "TMS"+jlib.getRandomNumber());
		jobj.put("status", "Completed");
		jobj.put("teamSize", 5);
		
		//pre condition
		given()
		.body(jobj).contentType(ContentType.JSON)
		//action
		//.when().post(baseURI+port+"/addProject")
		.when().post("/addProject")
		//validation
		//log().all() - It will return all the responses got from the server
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
		//.then().assertThat().time(Matchers.lessThan(5000L),TimeUnit.MILLISECONDS);
	}
}
