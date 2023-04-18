
//WAJP to print total no. of characters and space present in your name
package simpleWay;
import java.util.Scanner;
public class CharacterSpace 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine().toLowerCase();
		int spacecount=0;
		int chcount=0;
		for(int i=0;i<name.length();i++)
		{
			char ch = name.charAt(i);
			if(ch == ' ')
			{
				spacecount++;
			}
			else
				chcount++;
		}
		System.out.println("Spaces "+spacecount);
		System.out.println("Characters "+chcount);
	}
}
