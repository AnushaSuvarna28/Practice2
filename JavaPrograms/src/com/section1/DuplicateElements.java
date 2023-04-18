package com.section1;
import java.util.Scanner;
public class DuplicateElements 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = s.nextInt();
		//create array
		int a[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		//logic to check duplicate elements
		System.out.println("Duplicate elements are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[j]+"");
				}
			}
		}
	}

}
