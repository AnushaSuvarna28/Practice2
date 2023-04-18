package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.junit.Assert;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class CreateProject 
{
	@Test
	public void createProject()
	{
		//Step1 : Create the pre requisites - request body
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", "KotiChennayaPark"+jlib.getRandomNumber());
		jobj.put("status", "Completed");
		jobj.put("teamSize", 5);
		
		//Step2 : Perform the action
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://rmgtestingserver:8084/addProject");
		
		//Step3 : Validate the response
		//System.out.println(resp.contentType());
		//System.out.println(resp.prettyPrint());
		//System.out.println(resp.prettyPeek());
		//System.out.println(resp.asString());
		
		resp.then().log().all();
		//int actStatus = resp.getStatusCode();
		//Assert.assertEquals(actStatus, 201);
	}
}