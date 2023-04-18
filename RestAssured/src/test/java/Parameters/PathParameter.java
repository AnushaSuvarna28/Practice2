package Parameters;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PathParameter 
{
	
	@Test(priority=1)
	public void getSingleProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		given().pathParam("projectId", "TY_PROJ_9538")
		.when().get("/projects/{projectId}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
	}
	@Test(priority=2)
	public void updateProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("createdBy", "Anu");
		jobj.put("projectName", "asggs");
		jobj.put("status", "Completed");
		jobj.put("teamSize", 7);
		given().body(jobj).contentType(ContentType.JSON).pathParam("projectId", "TY_PROJ_11294")
		.when().put("/projects/{projectId}")
		.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		
	}
	@Test(priority=3)
	public void deleteProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		given().pathParam("projectId", "TY_PROJ_11281")
		.when().delete("/projects/{projectId}")
		.then().assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
	}
}
