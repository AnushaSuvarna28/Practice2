package Interface;

public class MultipleInheritance extends ClassC implements IntA, IntB
{
	@Override
	public void m() 
	{
		System.out.println("m1 is executing");
	}
	public static void main(String[] args) 
	{
		MultipleInheritance m1 = new MultipleInheritance();
		m1.m();
		System.out.println(a);
		System.out.println(b);
		ClassC cc = new ClassC();
		System.out.println(cc.c);
		IntA.m2();
	}
}
