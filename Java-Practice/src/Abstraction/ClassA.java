package Abstraction;

public class ClassA extends AbstractionImp
{
	@Override
	public void m2() 
	{
		System.out.println("Hi how are you");
	}
	public static void main(String[] args) 
	{
		ClassA a = new ClassA();
		a.m1();
		a.m2();
		AbstractionImp.m();
	}
}
