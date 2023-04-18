package SerializationAndDeserialization;
import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.Employee;
import POJOClassForSerializationAndDeserialization.EmployeeWithArray;

public class EmployeeSerializationWithArray 
{
	@Test
	public void serializationWithArray() throws Throwable
	{
		int a[] = {123,456};
		int b[] = {111,222};
		//EmployeeWithArray e1 = new EmployeeWithArray("Anusha",1,a);
		EmployeeWithArray e2 = new EmployeeWithArray("Anushka",2,b);
		
		ObjectMapper omap = new ObjectMapper();
		
		
		omap.writeValue(new File("./emparray.json"),e2);
	}
}
