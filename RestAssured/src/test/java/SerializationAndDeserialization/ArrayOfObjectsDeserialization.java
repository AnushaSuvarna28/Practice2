package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.ArrayOfObjects;

public class ArrayOfObjectsDeserialization 
{
	@Test
	public void deserialization() throws Throwable, JsonMappingException, IOException
	{
		ObjectMapper omap = new ObjectMapper();
		ArrayOfObjects[] res = omap.readValue(new File("./arrayOfObjects.json"), ArrayOfObjects[].class);
		for (ArrayOfObjects a : res)
		{
			System.out.println(a.getName()+" "+a.getId()+" "+a.getPhone());
		}
	}
}
