package WAYSOfPOSTING;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class JSONFile 
{
	@Test
	public void createPackage() throws Throwable
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		//FileInputStream fis = new FileInputStream("./src/test/java/WAYSOfPosting/jsonfile.json");
		//given().body(fis).contentType(ContentType.JSON)
		
		File file = new File("./src/test/java/WAYSOfPOSTING/jsonfile.json");
		given().body(file).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
	}
}
