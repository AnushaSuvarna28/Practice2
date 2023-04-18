package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation 
{
	@Test
	public void staticResponse()
	{
		//precondition
		String expData = "TY_PROJ_11289";
		baseURI = "https://rmgtestingserver";
		port = 8084;
		
		//action
		Response resp = when().get("/projects");
		
		String actualdata = resp.jsonPath().get("[1].projectId");
		System.out.println(actualdata);
		//Assert.assertEquals(actualdata,expData);
		//System.out.println("Data is verified");
		//resp.then();
	}
}
