package SerializationAndDeserialization;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.EmployeeWithObject;

public class EmployeeDeserializationWithObject 
{
	@Test
	public void empDeserializationObject() throws Throwable
	{
		ObjectMapper map = new ObjectMapper();
		EmployeeWithObject data = map.readValue(new File("./empobject.json"),EmployeeWithObject.class);
		System.out.println(data.getName());
		System.out.println(data.getS().getName());
		System.out.println(data.getS().getPhno()[0]);
		System.out.println(data.getS().getPhno()[1]);
	}
}
