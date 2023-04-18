package CrudWithoutBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteProject 
{
	@Test
	public void deleteProject()
	{
		RequestSpecification req = RestAssured.given();
		Response resp = req.delete("http://rmgtestingserver:8084/projects/TY_PROJ_9665");
		System.out.println(resp.asString());
		
		//validate
		resp.then().log().all();
		int actStatus = resp.getStatusCode();
		Assert.assertEquals(actStatus, 204);
	}
}
