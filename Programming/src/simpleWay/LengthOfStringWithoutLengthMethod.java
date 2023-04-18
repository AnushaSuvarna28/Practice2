package simpleWay;

public class LengthOfStringWithoutLengthMethod 
{

	public static void main(String[] args) 
	{
		String name = "Anusha Suvarna";
		char ch[] = name.toCharArray();
		int count = 0;
		for(char chs:ch)
		{
			count++;
		}
		System.out.println(count);
	}

}
