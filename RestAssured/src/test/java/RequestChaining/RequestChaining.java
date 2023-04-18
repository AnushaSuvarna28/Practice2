package RequestChaining;

import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.POJOClassPost;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class RequestChaining
{
	@Test
	public void reqChainin()
	{
		//Step 1 : Create a project using pojo class
		//pre conditions
		POJOClassPost pobj = new POJOClassPost("Anusha","DFSttuy","Completed","6");
		baseURI = "http://rmgtestingserver";
		port = 8084;
		//action
		Response res = given().body(pobj).contentType(ContentType.JSON)
		.when().post("/addProject");
		
		//store id in a variable
		String pid = res.jsonPath().get("projectId");
		System.out.println(pid);
		res.then().log().all();
		
		//use it in another request
		given().pathParam("proId", pid)
		.when().get("/projects/{proId}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	}

}
