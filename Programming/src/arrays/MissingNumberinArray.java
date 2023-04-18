package arrays;

public class MissingNumberinArray 
{

	public static void main(String[] args) 
	{
		int a[] = {10,11,12,13,15};
		int sum1= 0;
		for(int i=0;i<a.length;i++)
		{
			sum1 = sum1+a[i];
		}
		
		int sum2 = 0;
		for(int i=10;i<=15;i++)
		{
			sum2 = sum2+i;
		}
		
		int missingelement = sum2 -sum1;
		System.out.println(missingelement);
		
	}

}
