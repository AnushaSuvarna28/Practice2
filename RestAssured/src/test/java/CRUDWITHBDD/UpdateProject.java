package CRUDWITHBDD;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class UpdateProject 
{
	@Test
	public void updateProject()
	{
		baseURI = "httpJ"
				+ "://rmgtestingserver";
		port = 8084;
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("createdBy", "");
		jobj.put("projectName", "CMS"+jlib.getRandomNumber());
		jobj.put("status", "Completed");
		jobj.put("teamSize", 5);
		
		given().body(jobj).contentType(ContentType.JSON)
		.when().put("/projects/TY_PROJ_11289")   //method chaining
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		//Validating response time
		//.then().assertThat().time(Matchers.lessThan(500L),TimeUnit.MILLISECONDS);

	}
}
