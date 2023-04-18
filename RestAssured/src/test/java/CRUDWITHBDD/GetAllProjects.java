package CRUDWITHBDD;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GetAllProjects 
{
	@Test
	public void getAllProjects()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		Response res = when().get("/projects");
		Object str = res.jsonPath().get("projectName");
		System.out.println(str instanceof Object);
		//.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		//.then().assertThat().time(Matchers.lessThan(500L),TimeUnit.MILLISECONDS);
	}
}
