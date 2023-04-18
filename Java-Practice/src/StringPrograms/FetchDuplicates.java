package StringPrograms;

public class FetchDuplicates 
{
	public static void main(String[] args) 
	{
		String s = "anushAS"; //as
		String alphabets = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			for(int j=0;j<alphabets.length();j++)
			{
				if(ch == alphabets.charAt(j))
				{
					System.out.print(ch+" ");
					break;
				}
			}
		}
	}
}
