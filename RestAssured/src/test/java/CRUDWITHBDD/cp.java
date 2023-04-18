package CRUDWITHBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import PojoClass.genericUtility.CreateProjectPage;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class cp 
{
	@Test
	public void m()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		JavaLibrary ju = new JavaLibrary();
		int ran = ju.getRandomNumber();
		//CreateProjectPage cp = new CreateProjectPage("AnchuSuvarna","AWS", "Ongoing", "5");
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Anusha");
		jobj.put("projectName", "AnchuKarla"+ran);
		jobj.put("status", "Completed");
		jobj.put("teamSize", 5);
		Response res = given().body(jobj).contentType(ContentType.JSON)
		.when().post("/addProject");
		Object pid = res.jsonPath().get("projectId");
		if(pid instanceof String)
			System.out.println(pid);
		res.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}

}
