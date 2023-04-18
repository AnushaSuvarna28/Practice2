package Practice;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import GenericUtility.JavaLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.IOException;

public class WriteResponseToJsonFile 
{
	@Test
	public void write() throws IOException
	{
		baseURI = "https://api.github.com";
		JSONObject jobj = new JSONObject();
		JavaLibrary jlib = new JavaLibrary();
		jobj.put("name", "Kantara"+jlib.getRandomNumber());
		Response res = given().auth().oauth2("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").body(jobj).contentType(ContentType.JSON)
		.when().post("/user/repos");
		
			// Getting response as a string and writing in to a file
				String responseAsString = res.prettyPrint();
				// Converting in to byte array before writing
				byte[] responseAsStringByte = responseAsString.getBytes();
				// Creating a target file
				File targetFileForString = new File("D:\\jsonfile.json");
				// Writing into files
				Files.write(responseAsStringByte, targetFileForString);
	}
}
