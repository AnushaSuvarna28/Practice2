package Interface;

public class Child implements Parent
{
	public void m2() 
	{
		System.out.println("m2() from child");
	}
	public void m3()
	{
		System.out.println("m3() from child");
	}
	public static void main(String[] args) 
	{
		Child c = new Child(); // Parent p = new Child();
		c.m2();
		c.m3();
		Parent.m1();

	}

}
