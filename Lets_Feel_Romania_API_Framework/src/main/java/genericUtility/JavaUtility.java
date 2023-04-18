package genericUtility;

import java.util.Random;

public class JavaUtility 
{
	public int getRandomnNumber()
	{
		Random r = new Random();
		int num = r.nextInt(500);
		return num;
	}
}
