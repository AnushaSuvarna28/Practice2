package CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetSingleProject 
{
	@Test
	public void getSingleProject()
	{
	//Step 1 : Perform the action
	RequestSpecification req = RestAssured.given();
	Response resp = req.get("http://rmgtestingserver:8084/projects/TY_PROJ_9537");
	resp.then().log().all();
	//System.out.println(resp.prettyPrint());
	}
}
