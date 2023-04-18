package WAYSOfPOSTING;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class JSONObjectClass 
{
	@Test
	public void createProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", "LittleRock"+jlib.getRandomNumber());
		jobj.put("status", "ongoing");
		jobj.put("teamSize",5);
		
		given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();	
	}
}
