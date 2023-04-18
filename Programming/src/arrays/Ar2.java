package arrays;

import java.util.Arrays;

public class Ar2 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3};
		//1 - 1+2 3
		//2 - 1+3 4
		//3 - 2+3 5
		a[0] = a[0]+a[1];
		a[a.length-1] = a[a.length-1]+a[a.length-2];
		for(int i=0;i<a.length;i++)
		{
			try
			{
			if(i==1 && i<=a.length-2)
			   a[i]= a[i-1]+a[i+1];
			}
			catch(Exception e)
			{
				
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
