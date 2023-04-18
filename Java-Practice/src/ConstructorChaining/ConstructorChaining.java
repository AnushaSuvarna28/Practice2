package ConstructorChaining;

public class ConstructorChaining 
{
	String name;
	int age;
	String qual;
	String address;
	public ConstructorChaining(String name,int age,String address)
	{
		this(name,age);
		this.address = address;
	}
	public ConstructorChaining(String name,int age)
	{
		this(name);
		this.age = age;
	}
	public ConstructorChaining(String name)
	{
		this.name = name;
	}
	public ConstructorChaining()
	{
		System.out.println("Empty constructor");
	}
	public static void main(String[] args) 
	{
		ConstructorChaining c = new ConstructorChaining();
		ConstructorChaining c1 = new ConstructorChaining("Anusha",24,"Udupi");
		System.out.println(c1.name+" "+c1.age+" "+c1.address);
		ConstructorChaining c2 = new ConstructorChaining("Anusha",24);
		System.out.println(c2.name+" "+c2.age+" "+c2.address);
		ConstructorChaining c3 = new ConstructorChaining("Anusha");
		System.out.println(c3.name+" "+c3.age+" "+c3.address);
	}
}
