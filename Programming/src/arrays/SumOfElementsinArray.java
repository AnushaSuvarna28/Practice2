package arrays;

import java.util.Scanner;

public class SumOfElementsinArray 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("Sum of elements in the array is "+sum);

	}

}
