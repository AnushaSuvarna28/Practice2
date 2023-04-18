package StringPrograms;

public class SumOfDigitsInAString 
{
	public static void main(String[] args) 
	{
		String s = "Anush12Suvarna4";
		int sum = 0;
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				num = ch - 48;
				sum = sum+num;
			}
		}
		System.out.println(sum);
	}
}
