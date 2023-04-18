package ArrayPrograms;

import java.util.Arrays;

public class RotateReverse 
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		int key = 1;
			//Opt // 5 4 3 2 1
				  // 2 1 3 4 5
				  // 3 1 2 4 5
				  // 4 1 2 3 5
				  // 5 1 2 3 4
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
