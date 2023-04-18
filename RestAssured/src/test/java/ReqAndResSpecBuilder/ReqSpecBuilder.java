package ReqAndResSpecBuilder;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.*;

public class ReqSpecBuilder 
{
	@Test
	public void reqSpecBuilder()
	{
		RequestSpecification reqs = new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
									.setContentType(ContentType.JSON).build();
		ResponseSpecification resp = new ResponseSpecBuilder().expectContentType("application/json")
									.expectStatusCode(201).build();
		
		JavaLibrary jlib = new JavaLibrary();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Navya_Suvarna");
		jobj.put("projectName", "CID"+jlib.getRandomNumber());
		jobj.put("status", "Ongoing");
		jobj.put("teamSize", 5);
		
		given().spec(reqs).body(jobj)
		.when().post("/addProject")
		.then().spec(resp).log().all();
	}
}
