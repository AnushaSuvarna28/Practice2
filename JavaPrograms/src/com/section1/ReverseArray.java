package com.section1;
import java.util.Scanner;

public class ReverseArray 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = s.nextInt();
		//create an array
		int a[] = new int[n];
		//add array elements;
		System.out.println("Enter array elements");
	    for(int i=0;i<a.length;i++)
	    {
	    	a[i] = s.nextInt();
	    }
	    //print original array elements
	    System.out.println("Original array elements are: ");
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.print(a[i]+"  ");
	    }
	    //logic to print array elements in reverse order
	    System.out.println();
	    System.out.println("Array elements in reverse order: ");
	    for(int i=a.length-1;i>=0;i--)
	    {
	    	System.out.print(a[i]+"  ");
	    }

	}

}
