package SerializationAndDeserialization;
import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOClassForSerializationAndDeserialization.Employee;
import POJOClassForSerializationAndDeserialization.EmployeeWithArray;

public class EmployeeDeserializationWithArry 
{
	@Test
	public void empDeserialization() throws Throwable
	{
		ObjectMapper omap = new ObjectMapper();
		EmployeeWithArray data = omap.readValue(new File("./emparray.json"), EmployeeWithArray.class);
		System.out.println(data.getName());
		System.out.println(data.getId());
		int [] m=data.getPhno();
		for(int i=0;i<m.length;i++)
		{
		System.out.print(m[i]+" ");
		}
		System.out.println();
	}
}
