package SingletonClass;

public class Demo 
{
	int x = 10;
	static int count = 1;
	static Demo d;
	public void m()
	{
		System.out.println("m() is running");
	}
	private Demo()
	{
		System.out.println("Private Constructor Chaining");
	}
	public Demo getDemo()
	{
		if(count==1)
		{
			d = new Demo();
		}
		return d;
	}
}
