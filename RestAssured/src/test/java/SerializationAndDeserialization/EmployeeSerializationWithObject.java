package SerializationAndDeserialization;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.EmployeeWithObject;
import POJOClassForSerializationAndDeserialization.Spouse;

public class EmployeeSerializationWithObject 
{
	@Test
	public  void empObjectSer() throws Throwable,IOException
	{
		int a[] = {555,777};
		Spouse sp = new Spouse("Manya",a);
		EmployeeWithObject eobj = new EmployeeWithObject("Amma",sp);
		ObjectMapper omap = new ObjectMapper();
		omap.writeValue(new File("./empobject.json"),eobj);
	}
}

