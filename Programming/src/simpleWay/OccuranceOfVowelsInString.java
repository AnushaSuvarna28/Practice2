package simpleWay;

public class OccuranceOfVowelsInString 
{
		public static void main(String[] args) 
		{
	     String name = "education";
	     name = name.toLowerCase();
	     String vowels = "";
	     for(int i=0;i<name.length();i++)
	     {
	    	 char ch = name.charAt(i);
	    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	    	 {
	    		 vowels = vowels +ch;
	    	 }
	     }
	     System.out.println(vowels);
	     for(int i=0;i<vowels.length();i++)
	     {
	    	 char ch1 = vowels.charAt(i);
	    	 int count = 0;
	    	 for(int j=0;j<name.length();j++)
	    	 {
	    		 char ch2 = name.charAt(j);
	    		 if(ch1==ch2 && i>j)
	    		 {
	    			 break;
	    		 }
	    		 if(ch1==ch2)
	    		 {
	    			 count++;
	    		 }
	    	 }
	    	 if(count>0)
	    	 {
	    		 System.out.println(ch1+" ---> "+count);
	    	 }
	     }
	     
		}
	}
