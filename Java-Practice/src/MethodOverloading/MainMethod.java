package MethodOverloading;

public class MainMethod 
{
	public static void main(String args[])
	{
		System.out.println("Main method is executing");
		MainMethod.main(10, 20);
		MainMethod m = new MainMethod();
		m.main(3);
	}
	public void main(int x)
	{
		System.out.println("Non static main method is executing");
	}
	
	public static void main(int x,int y)
	{
		System.out.println("Main with 2 arguments is executing");
	}
}
