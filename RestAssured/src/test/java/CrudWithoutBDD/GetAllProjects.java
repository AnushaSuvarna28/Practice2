package CrudWithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllProjects 
{
	@Test
	public void getAllProjects()
	{
		RequestSpecification req = RestAssured.given();
		Response res = req.get("http://rmgtestingserver:8084/projects");
		res.then().log().all();
	}
}
