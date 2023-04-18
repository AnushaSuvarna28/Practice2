package Practice;

import org.testng.annotations.Test;

public class RunParamTest 
{
	@Test
	public void run()
	{
		String b = System.getProperty("browser");
		String u = System.getProperty("url");
		System.out.println(b);
		System.out.println(u);
	}
}
