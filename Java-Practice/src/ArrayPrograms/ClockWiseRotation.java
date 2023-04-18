package ArrayPrograms;

import java.util.Arrays;

public class ClockWiseRotation 
{
	public static void main(String[] args) 
	{
		int a[] = {3,7,4,9,1};
		 //1 3 7 4 9
		int key = 1;
		for(int i=1;i<=key;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int temp = a[0];
				a[0] = a[j];
				a[j] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
