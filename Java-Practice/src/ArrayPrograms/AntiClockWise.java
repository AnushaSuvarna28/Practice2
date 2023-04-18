package ArrayPrograms;

import java.util.Arrays;

public class AntiClockWise 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5};
				 //5 1 2 3 4
		int key=1;
		for(int i=1;i<=key;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				int temp = a[a.length-1];
				a[a.length-1] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
