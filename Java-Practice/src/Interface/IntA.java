package Interface;

public interface IntA 
{
	int a = 10;
	public void m();
	public static void m2()
	{
		System.out.println("static method");
	} 
	
	public static void main(String[] args) 
	{
		IntA a= new IntA() {
			
			@Override
			public void m() {
				// TODO Auto-generated method stub
			}
		};
		a.m();
	}
}
