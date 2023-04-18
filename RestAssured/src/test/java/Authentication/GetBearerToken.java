package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetBearerToken 
{
	@Test
	public void getRepo()
	{
		baseURI = "https://api.github.com";
		//using path paramter
//		given().auth().oauth2("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").pathParams("owner","AnushaSuvarna28").pathParam("repo","LavaKusha")
//		.when().get("/repos/{owner}/{repo}")
//		.then().log().all();
		
		//using variables
		String owner = "AnushaSuvarna28";
		String repo = "LavaKusha";
		given().auth().oauth2("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")
		.when().get("/repos/"+owner+"/"+repo+"")
		.then().log().all();
	}
}
