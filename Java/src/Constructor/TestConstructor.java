package Constructor;

public class TestConstructor 
{

	public static void main(String[] args) 
	{
		DemoConstructor dc = DemoConstructor.getDemoConstructor();
		System.out.println(dc.x);
		DemoConstructor dc1 = DemoConstructor.getDemoConstructor();
		System.out.println(dc1.x);
	}

}
