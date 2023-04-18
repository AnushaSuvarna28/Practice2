package ArrayPrograms;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
		int rev[] = new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			rev[j] = a[i];
			j++;
		}
		for(int i=0;i<rev.length;i++)
		{
			System.out.print(rev[i]+" ");
		}
	}
}
