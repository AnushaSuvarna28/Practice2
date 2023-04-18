package ConstructorChaining;

public class Child extends Parent
{
	String cname;
	int cage;
	public Child(String name,int age, String cname, int cage) 
	{
		super(name, age);
		this.cname = cname;
		this.cage = cage;
	}
	public static void main(String[] args) 
	{
		Child c = new Child("Bharathi",50,"Anusha",24);
		System.out.println(c.name+" "+c.age+" "+c.cname+" "+c.cage);
	}
}
