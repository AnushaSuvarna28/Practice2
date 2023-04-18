package StringPrograms;

public class FetchSumOfDigitsInStrng 
{
	public static void main(String[] args) 
	{
		String s = "Anusha123Nallur2";
		String numbers = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				numbers = numbers+ch;
			}
		}
		int n = Integer.parseInt(numbers);
		int sum = 0;
		while(n>0)
		{
			int rem = n%10;
			sum = sum+rem;
			n=n/10;
		}
		System.out.println(sum);
	}
}
