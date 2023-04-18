package StringPrograms;

public class ShadowElement 
{
	public static void main(String[] args) 
	{
		String s = "I Love India";
		char[] ch = s.toCharArray();
		String rev = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			if(i==1 && ch[i]==' ')
				rev = rev;
			else if(i==ch.length-2 && ch[i]!=' ')
			{
				rev = rev+" "+ch[i];
			}
			else
			{
				rev = rev+ch[i];
			}
		}
		System.out.println(rev);
	}
}
