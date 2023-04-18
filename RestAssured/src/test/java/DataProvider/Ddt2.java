package DataProvider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaLibrary;
import POJOClassForSerializationAndDeserialization.POJOClassPost;
import io.restassured.http.ContentType;

public class Ddt2
{
	ExcelUtility eu = new ExcelUtility();
	JavaLibrary jl = new JavaLibrary();
	@Test(dataProvider = "getData")
	public void ddt(String c,String p,String s,String t)
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		POJOClassPost pobj = new POJOClassPost(c,p+jl.getRandomNumber(),s,t);
		given().body(pobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	}
	@DataProvider
	public Object[][] getData() throws EncryptedDocumentException, IOException
	{
		Object[][] obj = eu.getMultipleDataFromExcel("Sheet1","Completed");
		return obj;
	}
}
