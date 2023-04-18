package StringPrograms;

public class GetAllSubstrig 
{
	public static void main(String[] args) 
	{
		String s = "momdadchildaba";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String str = s.substring(i, j+1); //
				
				String rev="";
				
				for (int k = str.length()-1; k >=0; k--) {
					
					rev=rev+str.charAt(k);
				}
				
				if(str.equals(rev))
				{
					System.out.print(str+" ");
				}
				
			}
		}
	}
	
	
}
