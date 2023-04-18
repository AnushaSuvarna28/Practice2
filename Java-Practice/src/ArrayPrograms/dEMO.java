package ArrayPrograms;

import java.util.Arrays;

public class dEMO 
{
	public static void main(String[] args)
	{
	int a[] = {1,2,3};
		//1 - 1+2
		//2 - 1+3
		//3 - 2+3
	//Output = {3,4,5}
	int prev = a[0];
	int b[] = new int[a.length];      
	for(int i=0;i<a.length-1;i++)
	{
		int cur = a[i];
		a[i] = prev+a[i+1];
		prev = cur;	
	}
	a[a.length-1] = prev+a[a.length-1];
	System.out.println(Arrays.toString(a));
	}
}
