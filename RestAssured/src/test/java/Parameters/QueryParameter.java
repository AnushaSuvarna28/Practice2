package Parameters;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class QueryParameter 
{
	@Test
	public void getPage()
	{
		baseURI = "https://reqres.in/";
		given().queryParam("page",3)
		.when().get("/api/users")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();	
	}
}
