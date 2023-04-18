package arrays;

import java.util.Scanner;

public class CopyArraytoAnotherArray 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array1");
		int size1 = sc.nextInt();
		System.out.println("Enter the size of the array2");
		int size2 = sc.nextInt();
		int arr1[] = new int[size1];
		int arr2[] = new int[size2];
		System.out.println("Enter array1 elements ");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i] = sc.nextInt();
		}
		if(arr1.length == arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				arr2[i] = arr1[i];
			}
			System.out.println("Array 2 elements are ");
			for(int i=0;i<arr2.length;i++)
			{
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Array size is not matched");
		}
	}

}
