package simpleWay;

public class ReplaceSpaceWithCommaInString 
{
		public static void main(String args[])
		{
			String s = "Anusha Suvarna from Udupi";
			char[] ch = s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				if(ch[i]==' ')
				{
					ch[i] = ',';
				}
			}
			for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]+"");
			}
		}
}
