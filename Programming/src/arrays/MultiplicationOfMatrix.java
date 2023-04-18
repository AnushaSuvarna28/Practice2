package arrays;

import java.util.Scanner;

public class MultiplicationOfMatrix 
{
	public static void main(String[] args) 
	{
		int a[][] = {
						{1,2,3},
						{4,5,6}
					};
		int b[][] = {
						{1,2,3},
						{4,5,6}
					};
		int mul[][] = new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			int sum = 0;
			for(int j=0;j<a[0].length;j++)
			{
				sum = sum+a[i][j]+b[i][j];
			}
			for(int k=0;k<a.length;i++)
			{
				mul[i][k] = sum;
			}
		}
		
	}
}
