package ArrayPrograms;

import java.util.Arrays;

public class AdditionOfPreviousAndNextElement 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3};
				  // 1 - 1+2
				  // 2 - 1+3
				  // 3 - 2+3
		int prev = a[0]; 
		a[0] = a[0]+a[1];
		for(int i=1;i<a.length-1;i++)
		{
			int cur = a[i];
			a[i] = prev + a[i+1];
			prev = cur;
		}
		a[a.length-1] = a[a.length-1]+prev;
		System.out.println(Arrays.toString(a));
	}
}
