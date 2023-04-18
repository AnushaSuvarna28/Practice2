package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		//declaration of array
		
		//first way
		int a[] = {1,2,3,4,5}; 
		//int[] a = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(a));
		/*
		//second way
		Scanner s = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter elements into the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		
		/* 
		can we change size of the array at runtime   -  NO
		can we add or delete an element after assigning an array   - NO
		
	    Default value of array
	    byte,short,int,long - 0
	    float,double        - 0.0
	    boolean             - false
	    object              - null
	    
	    */
		
		boolean[] ch = new boolean[5];
		System.out.println(Arrays.toString(ch));
		
		char[] ch1 = new char[5];
		System.out.println(Arrays.toString(ch1));
		
		int[] ch2 = new int[5];
		System.out.println(Arrays.toString(ch2));
		
		String[] ch3 = new String[5];
		System.out.println(Arrays.toString(ch3));
		
		float[] ch4 = new float[5];
		System.out.println(Arrays.toString(ch4));
		
		//sort an array
		int arr1[] = {1,4,2,7,5,8,0};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		//compare two array
		int arr2[] = {1,2,3,4};
		int arr3[] = {1,2,3,4};
		System.out.println(Arrays.equals(arr2, arr3));
		
		//copy array elements into another array
		int arr4[] = {1,2,3,4,5};
		int arr5[] = {2,4,5,67,23};
		arr4 = arr5;
		System.out.println(Arrays.toString(arr4));
		
	}

}
