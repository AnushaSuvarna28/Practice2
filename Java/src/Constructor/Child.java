package Constructor;

public class Child extends Parent
{
	int ph;
	public Child(String name,int id,int ph)
	{
		super(name,id);
		this.ph = ph;
	}
	public static void main(String args[])
	{
		Child c = new Child("Anusha",1,1222);
		System.out.println(c.name);
		System.out.println(c.id);
		System.out.println(c.ph);
	}
}
