package CRUDWITHBDD;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProject 
{
	@Test
	public void deleteProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		when().delete("/projects/OnlineFoodOrderingSysytem-381")
		//.then().assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
		.then().assertThat().time(Matchers.lessThan(1000L),TimeUnit.MILLISECONDS);
	}
}
