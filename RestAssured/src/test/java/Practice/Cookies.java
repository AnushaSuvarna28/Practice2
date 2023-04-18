package Practice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;

import java.util.Map;
import java.util.Map.Entry;

import static io.restassured.RestAssured.*;

public class Cookies 
{
	@Test
	public void sendCookie()
	{
//		//getting cookies
// 		Response res = when().get("https://www.google.com/");
//		String cookie = res.getCookie("AEC");
//		System.out.println(cookie);
//		Map<String, String> cookies = res.getCookies();
//		for( Entry<String, String> ck:cookies.entrySet())
//		{
//			System.out.println(ck.getKey()+"  "+ck.getValue());
//		}
		
//		//sending cookies
//		Response res = given().cookies("Name","AnushaSuvarna")
//		.when().get("https://www.google.com/")
//		.then().extract().response();
//		res.then().log().all();
//		
//		//how to extract cookie from resp and use it in another request
//		Map<String, String> cookie = res.getCookies();
//		
//		//use it in another request
//		given().cookies(cookie)
//		.when().get("https://www.amazon.com/")
//		.then().log().all();
        String cookieValue = "mycookie=1234567890";

		Response res = given().header("Cookie", cookieValue)
				.when().get("https://www.google.com");
		res.then().log().all();
		}
}
