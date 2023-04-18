package simpleWay;

public class ReverseEachWord 
{
	public static void main(String[] args) {
		String s = "I am in ooty";
		String[] str = s.split(" ");
		for(int i=0;i<str.length;i++)
		{
			String word = str[i];
			String rev = "";
			for(int j=word.length()-1;j>=0;j--)
			{
				rev =rev+word.charAt(j);
			}
			str[i] = rev;
		}
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
	}
}
