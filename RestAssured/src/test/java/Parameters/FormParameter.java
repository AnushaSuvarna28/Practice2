package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class FormParameter 
{
	@Test
	public void createProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		given().formParam("createdBy", "Anusha")
		.formParam("projectName", "dfdf")
		.formParam("status", "Completed")
		.formParam("teamSize", 4)
		.contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
}
