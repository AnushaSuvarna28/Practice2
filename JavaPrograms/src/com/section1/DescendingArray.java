package com.section1;

import java.util.Scanner;
public class DescendingArray 
{

	public static void main(String[] args) 
	{
		int temp = 0 ;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = s.nextInt();
		//create an array
		int a[] = new int[n];
		//add array elements
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = s.nextInt();
		}
		//print array elements
		System.out.println("Original array elements are");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		System.out.println();
		//logic to make array elements in descending order
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length ;j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
				
		}
		System.out.println("Array elements in descending order: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}

	}

}
