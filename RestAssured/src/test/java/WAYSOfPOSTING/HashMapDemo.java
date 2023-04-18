package WAYSOfPOSTING;

import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class HashMapDemo 
{
	@Test
	public void createProject()
	{
		JavaLibrary jlib = new JavaLibrary();
		baseURI = "http://rmgtestingserver";
		port = 8084;
		HashMap hmap = new HashMap();
		hmap.put("createdBy", "Anusha");
		hmap.put("projectName", "IMS"+jlib.getRandomNumber());
		hmap.put("status", "Completed");
		
		hmap.put("teamSize", 5);
		
		given().body(hmap).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
}
