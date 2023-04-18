package Array;

public class RemoveWhiteSpacesInString 
{

	public static void main(String[] args) 
	{
		String name = "Anusha Suvarna Karkala Udupi Karnataka";
		String names = name.replaceAll("\\s", "");
		System.out.println(names);

	}

}
