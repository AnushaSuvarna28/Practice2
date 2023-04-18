package simpleWay;

public class CountVowelsInEachWord 
{
	public static void main(String[] args) {
		String[] s = {"Vijay","Vivek","Jawahar"};
		for(int i=0;i<s.length;i++)
		{
			String word = s[i].toLowerCase();
			int tcount=0;
			for(int j=0;j<word.length();j++)
			{
				char ch = word.charAt(j);
				int count = 0;
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					count++;
				}
				tcount = tcount+count;
			}
			if(tcount>0)
			{
				System.out.println(s[i]+" has "+tcount+" vowels");
			}
		}
	}
}
