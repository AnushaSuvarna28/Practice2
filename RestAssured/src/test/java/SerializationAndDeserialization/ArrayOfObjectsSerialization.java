package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.ArrayOfObjects;
import POJOClassForSerializationAndDeserialization.POJOClassPost;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class ArrayOfObjectsSerialization 
{
	@Test
	public void serialization() throws Throwable, JsonMappingException, IOException
	{
		ArrayList al = new ArrayList();
		al.add(new ArrayOfObjects("Anusha",1,123));
		al.add(new ArrayOfObjects("Anusha123",1,1234));
		ObjectMapper omap = new ObjectMapper();
		omap.writeValue(new File("./arrayOfObjects.json"),al);
		
	}
}
