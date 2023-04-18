package Validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponse 
{
	@Test
	public void response()
	{
		//pre condition
		baseURI = "http://rmgtestingserver";
		port = 8084;
		String projectId = "TY_PROJ_11765";
		//action
		Response resp = when().get("/projects");
		//validation
		boolean flag = false;
		List<String> pids = resp.jsonPath().get("projectId");
		for(String pid:pids)
		{
			if(pid.equalsIgnoreCase(projectId))
			{
				flag = true;
			}
		}
		Assert.assertTrue(flag);
		System.out.println("Data is verified");
		//resp.then().log().all();
	}
}
