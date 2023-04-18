package GenericUtility;

import java.util.Date;
import java.util.Random;

public class JavaLibrary 
{
	public int getRandomNumber()
	{
		Random r = new Random();
		int n = r.nextInt(1000);
		return n;
	}
}
