package TYSS;

public class RemoveWhiteSpacse 
{
public static void main(String args[])
{
	String s = "Hi this is java";
	String word = "";
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		{
			if(ch!=' ')
			{
				word = word +ch;
			}
		}
	}
	System.out.println(word);
}
}
