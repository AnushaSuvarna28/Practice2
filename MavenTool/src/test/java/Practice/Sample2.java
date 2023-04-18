package Practice;

import org.testng.annotations.Test;

public class Sample2 
{
	@Test(groups = "smoke")
	public void m4()
	{
		System.out.println("m4 is executing");
	}
	@Test(groups = "regression")
	public void m5()
	{
		System.out.println("m5 is executing");
	}
	@Test(groups = "system")
	public void m6()
	{
		System.out.println("m6 is executing");
	}
}
