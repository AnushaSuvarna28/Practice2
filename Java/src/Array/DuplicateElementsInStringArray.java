package Array;

public class DuplicateElementsInStringArray 
{

	public static void main(String[] args) 
	{
		String a[] = {"Anu","Anusha","Anu","Anush","Anushree"};
		for(int i=0;i<a.length;i++)
		{
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i].equals(a[j])&&i>j)
				{
					break;
				}
				if(a[i].equals(a[j]))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(a[i]+" ---> "+count);
			}
		}

	}

}
