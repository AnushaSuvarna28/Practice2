package arrays;

import java.util.Scanner;

public class DuplicateElementsArray 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter array elements ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			int count = 0;
			for(int j=0;j<arr.length;j++)
			{
				if((arr[i]==arr[j])&&(i>j))
				{
					break;
				}
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]+" ----> "+count);
			}
		}

	}

}
