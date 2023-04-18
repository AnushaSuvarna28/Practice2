package SerializationAndDeserialization;
import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.Employee;

public class EmployeeSerialization 
{
	@Test
	public void employeeSerialization() throws Throwable
	{
		Employee emp = new Employee("Navya",1,123);
		ObjectMapper omap = new ObjectMapper();
		omap.writeValue(new File("./emp.json"),emp);
	}
}
