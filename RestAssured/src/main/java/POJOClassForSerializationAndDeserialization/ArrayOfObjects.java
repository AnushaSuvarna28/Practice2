package POJOClassForSerializationAndDeserialization;

public class ArrayOfObjects 
{
	String name;
	int id;
	int phone;
	public ArrayOfObjects(String name, int id, int phone) 
	{
		this.name = name;
		this.id = id;
		this.phone = phone;
	}
	public ArrayOfObjects() 
	{
		
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	

}
