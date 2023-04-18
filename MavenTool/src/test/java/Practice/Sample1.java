package Practice;

import org.testng.annotations.Test;

public class Sample1 
{
	@Test(groups = {"smoke","system"})
	public void m1()
	{
		System.out.println("m1 is executing");
	}
	@Test(groups = "regression")
	public void m2()
	{
		System.out.println("m2 is executing");
	}
	@Test(groups = "system")
	public void m3()
	{
		System.out.println("m3 is executing");
	}
}
