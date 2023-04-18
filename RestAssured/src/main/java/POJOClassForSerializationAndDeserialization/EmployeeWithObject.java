package POJOClassForSerializationAndDeserialization;

public class EmployeeWithObject 
{
	String name;
	Spouse s;
	public EmployeeWithObject(String name, Spouse s) 
	{
		this.name = name;
		this.s = s;
	}
	public EmployeeWithObject() 
	{
	}
	public String getName() 
	{
		return name;
	}
	public Spouse getS() 
	{
		return s;
	}
}
