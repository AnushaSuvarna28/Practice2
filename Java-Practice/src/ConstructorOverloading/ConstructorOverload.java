package ConstructorOverloading;
public class ConstructorOverload 
{
	String name;
	int age;
	String qualification;
	String nativeplace;
	public ConstructorOverload(String name,int age,String qualification,String nativeplace)
	{
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.nativeplace = nativeplace;
	}
	public ConstructorOverload()
	{
		System.out.println("Empty Constructor");
	}
	public ConstructorOverload(String name)
	{
		this.name = name;
	}
	public ConstructorOverload(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public ConstructorOverload(String name,int age, String qualification)
	{
		this.name = name;
		this.age = age;
		this.qualification = qualification;
	}
	public static void main(String args[])
	{
		ConstructorOverload c = new ConstructorOverload();
		ConstructorOverload c1 = new ConstructorOverload("Anusha");
		System.out.println(c1.name);
		ConstructorOverload c2 = new ConstructorOverload("Anusha",24);
		System.out.println(c2.name+" "+c2.age);
		ConstructorOverload c3 = new ConstructorOverload("Anusha",24,"Diploma");
		System.out.println(c3.name+" "+c3.age+" "+c3.qualification);
		ConstructorOverload c4 = new ConstructorOverload("Anusha",24,"Diploma","Udupi");
		System.out.println(c4.name+" "+c4.age+" "+c4.qualification+" "+c4.nativeplace);
		
	}
}
