package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation 
{
	@Test
	public void dynamicResp()
	{
		//precondition
		String expData = "TY_PROJ_19310";
		baseURI = "http://rmgtestingserver";
		port = 8084;
		//action
		Response resp = when().get("/projects");
		//validation
		boolean flag = false;
		List<String> pids = resp.jsonPath().get("projectId");
		for(String pid : pids)
		{
			if(pid.equalsIgnoreCase(expData))
			{
				flag = true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data verified");
		resp.then().statusCode(200).log().all();
	}
}
