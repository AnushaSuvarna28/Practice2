package StringPrograms;

public class CountOfCharactersAndDigitsAndSplChar 
{
	public static void main(String[] args) 
	{
		String str = "Anusha123$#%>".toLowerCase();
		int a = 0;
		int d = 0;
		int s = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0'&&str.charAt(i)<='9')
			{
				d++;
			}
			else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
			{
				a++;
			}
			else
			{
				s++;
			}
		}
		System.out.println("Digits count is "+d);
		System.out.println("Alphabets count is "+a);
		System.out.println("Spl characters count is "+s);
	}
}
