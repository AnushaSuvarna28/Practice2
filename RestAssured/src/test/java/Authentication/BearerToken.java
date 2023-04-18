package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;

public class BearerToken 
{
	@Test
	public void createRepo()
	{
		baseURI="https://api.github.com";
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("name", "ChaliPolilu"+jlib.getRandomNumber());
		given().auth().oauth2("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").body(jobj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
}
