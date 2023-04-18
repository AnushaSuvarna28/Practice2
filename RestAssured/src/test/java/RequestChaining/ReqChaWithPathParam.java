package RequestChaining;

import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.POJOClassPost;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ReqChaWithPathParam 
{
	@Test
	public void requestChaining()
	{
		POJOClassPost pobj = new POJOClassPost("Anusha","yyyas","completed","3");
		baseURI = "http://rmgtestingserver";
		port = 8084;
		Response res = given().body(pobj).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		String id = res.jsonPath().get("projectId");
		res.then().log().all();
		
		when().get("/projects/"+id+"")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON);
	}

}
