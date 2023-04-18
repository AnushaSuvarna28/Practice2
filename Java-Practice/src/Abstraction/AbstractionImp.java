package Abstraction;

public abstract class AbstractionImp 
{
	public static void m()
	{
		System.out.println("abstract class static method");
	}
	public void m1()
	{
		System.out.println("Abstract class non static method");
	}
	public abstract void m2();
	public static void main(String[] args) {
		AbstractionImp a = new AbstractionImp() {

			@Override
			public void m2() 
			{
				// TODO Auto-generated method stub
				
			}
		};
	}
}
