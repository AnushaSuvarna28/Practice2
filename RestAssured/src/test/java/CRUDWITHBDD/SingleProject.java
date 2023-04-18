package CRUDWITHBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class SingleProject 
{
	@Test
	public void getSingleProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		Response res = when().get("/projects/TY_PROJ_21809");
		res.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}
}
