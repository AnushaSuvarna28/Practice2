package CrudWithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProject 
{
	@Test
	public void updateProject()
	{
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", "KotiChennayya");
		jobj.put("status", "Ongoing");
		jobj.put("teamSize", 5);
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj);
		req.contentType(ContentType.JSON);
		Response resp = req.put("http://rmgtestingserver:8084/projects/TY_PROJ_18738");
		System.out.println(resp.asString());
	}
}
