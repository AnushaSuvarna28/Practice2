package StringPrograms;
public class ReverseStringUsingRecursion 
{
	    public static void main(String[] args) 
	    {
	        String str = "anusha is a demon";
	        String reversedStr = reverseWords(str);
	        System.out.println("Original string: " + str);
	        System.out.println("Reversed string: " + reversedStr);
	    }
	    public static String reverseWords(String str) 
	    {
	        if (str.isEmpty()) 
	        {
	            return str;
	        }
	        int indexOfSpace = str.indexOf(" ");
	        if (indexOfSpace == -1) 
	        {
	            return reverseWords("") + str + " ";
	        }
	        String firstWord = str.substring(0, indexOfSpace);
	        String remainingWords = str.substring(indexOfSpace + 1);
	        return reverseWords(remainingWords) + firstWord + " ";
	    }  
	}