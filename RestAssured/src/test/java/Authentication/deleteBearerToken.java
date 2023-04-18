package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class deleteBearerToken 
{
	@Test
	public void deleteRepo()
	{
		baseURI = "https://api.github.com";
		//using path parameter
//		given().auth().oauth2("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").pathParam("owner", "AnushaSuvarna28").pathParam("repo", "LavaKusha")
//		.when().delete("/repos/{owner}/{repo}")
//		.then().log().all();
		
		//using variable
		String owner = "AnushaSuvarna28";
		String repo = "LavaKusha";
		given().auth().oauth2("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")
		.when().delete("/repos/"+owner+"/"+repo+"")
		.then().log().all();
	}
}
