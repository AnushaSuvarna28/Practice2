package Validation;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponse 
{
	@Test
	public void get()
	{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	//precondition
	String status = "Completed";
	//action
	Response res = when().get("/projects");
	//validation
	String actualdata = res.jsonPath().get("[1].status");
	Assert.assertEquals(actualdata, status);
	}

}
