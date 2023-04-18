package Practice;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class UploadImageInPetStore 
{
	@Test
	public void uploadImage()
	{
		baseURI = "https://petstore.swagger.io/v2";
		File f = new File("D:\\download.png");
		given().pathParam("petId", 67)
		.multiPart("file",f)
		.contentType("multipart/form-data")
		.when().post("/pet/{petId}/uploadImage")
		.then().log().all();
	}
}
