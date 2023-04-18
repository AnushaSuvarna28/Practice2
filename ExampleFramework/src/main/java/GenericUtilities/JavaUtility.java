package GenericUtilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class JavaUtility 
{
	public int getRandomNumber()
	{
		Random r = new Random();
		int num = r.nextInt();
		return num;
	}
	
	public String getSystemDate()
	{
		Date dt = new Date();
		String d = dt.toString();
		return d;
	}
	
	public String getSystemDateFormat()
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-YYYY HH:MM:SS");
		String dt = sdf.format(d);
		return dt.replaceAll(":", "-");
	}
}
