package com.section1;

import java.util.Scanner;
public class AscendingArray 
{

	public static void main(String[] args) 
	{
		int temp = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = s.nextInt();
		//create array
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		//logic to make array elements in ascending order
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Array elements in ascending order: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
	}
}
