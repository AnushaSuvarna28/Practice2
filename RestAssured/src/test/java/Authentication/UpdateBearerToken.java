package Authentication;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class UpdateBearerToken 
{
	@Test
	public void update()
	{
		baseURI = "https://api.github.com";
		JSONObject jobj = new JSONObject();
		jobj.put("name", "LavaKusha");
		given().auth().oauth2("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").pathParam("owner", "AnushaSuvarna28").body(jobj).pathParam("repo", "ChaliPolilu")
		.when().patch("/repos/{owner}/{repo}")
		.then().log().all();
	}
}
