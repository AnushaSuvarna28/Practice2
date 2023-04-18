package SerializationAndDeserialization;
import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.Employee;

public class EmployeeDeserialization 
{
	@Test
	public void employeedeserialization() throws Throwable
	{
		ObjectMapper omap = new ObjectMapper();
		Employee data = omap.readValue(new File("./emp.json"),Employee.class);
		System.out.println(data.getName());
		System.out.println(data.getId());
		System.out.println(data.getPhno());
	}
}