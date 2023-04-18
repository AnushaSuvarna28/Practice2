package StringPrograms;

public class PalindromePgm 
{
	public static void main(String[] args) 
	{
		String s = "momdadchild";
		String act = "";
		String palindrome = "";
		for(int i=0;i<s.length();i++)
		{
			String rev = "";
			char ch = s.charAt(i);
			act = ""+ch;
			for(int j=act.length()-1;j>=0;j--)
			{
				rev = ""+act.charAt(j);
			}
			if(act.equals(rev))
			{
				palindrome = palindrome+act;
			}
		}
	
	}
}
