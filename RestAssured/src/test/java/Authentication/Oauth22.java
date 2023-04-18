package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Oauth22
{
	@Test
	public void demo()
	{
	//create a equest to generate the access token
		Response res = given()
		.formParam("client_id", "ChitChat")
		.formParam("client_secret","71b0e3287a9884960997d98801520ae4")
		.formParam("grant_type","client_credentials")
		.formParam("redirect_uri ","http://chitchat.com")
		.formParam("code","authorization_code")
		.when().post("http://coop.apps.symfonycasts.com/token");
	//capture the token 
		String token = res.jsonPath().get("access_token");
		System.out.println(token);
		
	//use it in another request
		given().auth().oauth2(token).pathParam("user_id",4357)
		.when().post("http://coop.apps.symfonycasts.com/api/{user_id}/eggs-collect")
		.then().log().all();
		
	}
}
