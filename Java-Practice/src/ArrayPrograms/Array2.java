package ArrayPrograms;

import java.util.Arrays;

public class Array2 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int[] n = new int[arr.length];
		int key = 5;
		int keyin = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(key==arr[i])
			{
				for(int j=0;j<n.length;j++)
				{
					n[j] = arr[i++];
					if(i==arr.length)
					{
						keyin = j;
						break;
					}
				}
			}
		}
		for(int i=keyin+1;i<n.length;i++)
		{
			int a = 0;
			n[i] = arr[a]++;
		}
		System.out.println(Arrays.toString(n));
	}
}
