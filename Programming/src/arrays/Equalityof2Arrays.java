package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Equalityof2Arrays 
{

	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,5,3,4,5};
		boolean cond = true;
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
					cond = false;
			}
		}
		else
		{
			cond = false;
		}
		if(cond == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
		//one way 
		/*
		boolean cond = Arrays.equals(arr1, arr2);
		if(cond==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		*/
		
		//another way
	}
}

	
