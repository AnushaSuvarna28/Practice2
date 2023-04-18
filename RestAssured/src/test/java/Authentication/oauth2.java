package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class oauth2 
{
	@Test
	public void authent()
	{
		//Create a request to generate a access token 
			Response res = given()
			.formParam("client_id", "Express")
			.formParam("client_secret", "341fdf2159c0a5cef5a9932faf95d284")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "http://express.com")
			.formParam("code", "authorization_code")
			.when().post("http://coop.apps.symfonycasts.com/token");
			
		//Capture the access token from the response of the above request
			String token = res.jsonPath().get("access_token");
			System.out.println(token);
			
		//Create another request and use the token to access the APIs
			given().auth().oauth2(token).pathParam("USER_ID",4357)
			.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
			.then().log().all();
			
			
			
	}
}
