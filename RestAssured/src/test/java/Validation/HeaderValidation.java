package Validation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HeaderValidation
{
	@Test
	public void getSingleProject()
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		
		String expVary = "Access-Control-Request-Headers";
		String expPragma = "no-cache";
		String expConType = "application/json";
		String expStatusLine = "HTTP/1.1 200 ";

		Response res = when().get("/projects/TY_PROJ_9538");
		
		String ct = res.getContentType();
		System.out.println(ct);
		
		String h = res.getHeader("vary");
		System.out.println(h);
		
		String p = res.getHeader("Pragma");
		System.out.println(p);
		
		String statusLine = res.getStatusLine();
		System.err.println(statusLine);
		
		res.then().log().all();
		
		Assert.assertEquals(h, expVary);
		Assert.assertEquals(p,expPragma);
		Assert.assertEquals(ct,expConType);
		Assert.assertEquals(statusLine,expStatusLine);
	}
}
