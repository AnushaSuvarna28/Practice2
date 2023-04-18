package WAYSOfPOSTING;

import static io.restassured.RestAssured.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PropertiesPost 
{
	@Test
	public void createProject() throws Throwable
	{
		baseURI = "http://rmgtestingserver";
		port = 8084;
		FileInputStream fis = new FileInputStream("D:\\project\\tyss\\notes\\notes\\api\\post.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		given().body(pobj).contentType(ContentType.JSON)
		.when().post("/addProject")
		.then().assertThat().statusCode(201).log().all();
	}	
}
