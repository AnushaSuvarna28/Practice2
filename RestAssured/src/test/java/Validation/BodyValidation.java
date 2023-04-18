package Validation;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class BodyValidation 
{
	@Test
	public void create()
	{
	baseURI = "http://rmgtestingserver";
	port = 8084;
	JSONObject jobj = new JSONObject();
	JavaLibrary jlib = new JavaLibrary();
	jobj.put("createdBy", "Anusha");
	jobj.put("projectName", "CEO"+jlib.getRandomNumber());
	jobj.put("status", "Completed");
	jobj.put("teamSize", 5);
	
	Response res = given().body(jobj).contentType(ContentType.JSON)
	.when().post("/addProject");
	
//	ResponseBody body1 = res.body(); 
//	
//	//System.out.println(body1.print());     		//print msg in a single line 2 times
//	//System.out.println(body1.prettyPrint());		//print msg 2 times
//	
//	//System.out.println(body1.peek());     		// print resp header as well as body(in single line)
//	//System.out.println(body1.prettyPeek());  		// print resp header as well as body
//	
//	//System.out.println(body1.asString());  		//print the msg as string  in a single line
//	//System.out.println(body1.asPrettyString());		//print the msg as string

	ResponseBody body2 = res.getBody();
	System.out.println(body2.asString());
	
	String contentType1 = res.getContentType();
	System.out.println(contentType1);
	
	String contentType2 = res.contentType();
	System.out.println(contentType2);
	
	int statuscode1 = res.getStatusCode();
	System.out.println(statuscode1);

	int statuscode2 = res.statusCode();
	System.out.println(statuscode2);

	String statusLine1 = res.getStatusLine();
	System.out.println(statusLine1);	
	String statusLine2 = res.statusLine();
	System.out.println(statusLine2);

	ResponseBody body3 = res.body();
	ResponseBody peek = body3.peek();
	System.out.println(peek);
	
	String print = body3.prettyPrint();
	System.out.println(print);
	
	ResponseBody prettyPeek = body3.prettyPeek();
	System.out.println(prettyPeek);
	
	String a = body3.print();
	System.out.println(a);
	}
}
