package simpleWay;

public class CountOfAlphabet 
{
	//s
public static void main(String[] args) {
	String s = "Anusha Salian".toLowerCase();
	int count = 0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)=='s')
		{
			count++;
		}
	}
	System.out.println(count);
}
}
