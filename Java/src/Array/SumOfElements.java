package Array;

public class SumOfElements 
{

	public static void main(String[] args) 
	{
		int a[] = {10,2,3,54,78};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum+a[i];
		}
		System.out.println("Sum of elements in the array is "+sum);
	}

}
