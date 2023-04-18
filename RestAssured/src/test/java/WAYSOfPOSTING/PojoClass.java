package WAYSOfPOSTING;

import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import POJOClassForSerializationAndDeserialization.POJOClassPost;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PojoClass 
{
	@Test
	public void createProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		JavaLibrary jlib = new JavaLibrary();
		POJOClassPost poj = new POJOClassPost("Anusha", "CCS"+jlib.getRandomNumber(), "Ongoing", "4");
		given().body(poj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
}
