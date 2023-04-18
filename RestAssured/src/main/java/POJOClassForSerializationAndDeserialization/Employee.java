package POJOClassForSerializationAndDeserialization;

public class Employee 
{
	//Step1 : Declare the variables globally
	String name;
	int id;
	int phno;
	//Step2 : Create constructor to initialize values
	public Employee(String name, int id, int a) 
	{
		this.name = name;
		this.id = id;
		this.phno = a;
	}
	//Step 3 : Create a empty constructor to trigger the execution for serialization and deserialization
	public Employee() 
	{
		
	}
	//Step 4 : provide getters and setters
	public String getName() 
	{
		return name;
	}
	public int getId() 
	{
		return id;
	}
	public int getPhno() 
	{
		return phno;
	}
}
