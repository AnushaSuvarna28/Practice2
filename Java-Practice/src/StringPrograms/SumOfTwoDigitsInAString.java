package StringPrograms;

import java.util.Arrays;

public class SumOfTwoDigitsInAString 
{
	public static void main(String[] args) 
	{
		String s = "Anusha123Suvarna2Karkala123";
		int a[] = new int[6];
		int num = 0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				char ch = s.charAt(i);
				if(ch>='0'&&ch<='9')
				{
					num = ch-48;
					System.out.println(num);
					try
					{
					a[i]=num;
					}
					catch(Exception e)
					{
						
					}
				}
			}
		}
	}
}
