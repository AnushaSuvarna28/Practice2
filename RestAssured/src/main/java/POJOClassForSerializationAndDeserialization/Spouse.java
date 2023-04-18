package POJOClassForSerializationAndDeserialization;

public class Spouse 
{
	String name;
	int phno[];
	public Spouse(String name, int[] phno) 
	{
		this.name = name;
		this.phno = phno;
	}
	public Spouse() 
	{
		
	}
	public String getName() 
	{
		return name;
	}
	public int[] getPhno() 
	{
		return phno;
	}
}
