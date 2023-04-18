package Practice;

import org.testng.annotations.Test;

public class RunConfigTest
{
	@Test
	public void run()
	{
		String n = System.getProperty("name");
		String a = System.getProperty("age");
		System.out.println(n);
		System.out.println(a);
	}
}
