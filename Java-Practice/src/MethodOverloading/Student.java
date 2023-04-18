package MethodOverloading;

public class Student 
{
	public static void m1()
	{
		System.out.println("m1 static block is executing");
	}
	public void m1(int x,int y,int z)
	{
		System.out.println("m1 non static block is executing");
	}
	
	public void m1(int x,int y)
	{
		System.out.println("m1 block with 2 argument");
	}
	public static void m1(int x)
	{
		System.out.println("m1 with one argument");
	}
	public static void main(String args[])
	{
		System.out.println("main method is executing");
		Student s = new Student();
		Student.m1();
		s.m1();
		s.m1(10,20);
		s.m1(10,20,30);
	}
}
