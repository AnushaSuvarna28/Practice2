package ArrayPrograms;

import java.util.Arrays;

public class ArrayIndexRotation 
{
	public static void main(String[] args) 
	{
		int a[] = {7,9,8,0};
		int key=2;
		for(int i=1;i<=key;i++)
		{
			int temp=0;
			for(int j=a.length-1;j>0;j--)
			{
				temp = a[a.length-1];
				a[a.length-1] = a[j-1];
				a[j-1] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
