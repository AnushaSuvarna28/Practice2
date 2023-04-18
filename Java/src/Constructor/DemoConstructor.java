package Constructor;

public class DemoConstructor 
{
	int x = 10;
	static int count = 1
			;
	static DemoConstructor dc;
	 private DemoConstructor()
	{
		System.out.println("Private constructor is executing");
		count++;
	}
	 public static DemoConstructor getDemoConstructor()
	 {
		if(count==1)
		{
			dc = new DemoConstructor();
		}
		return dc;
	 }

}
