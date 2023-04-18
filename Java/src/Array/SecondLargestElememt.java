package Array;

public class SecondLargestElememt 
{

	public static void main(String[] args) 
	{
		int arr[] = {23,4,5,25,89};
		int largest = arr[0];
		int secondlargest = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest)
			{
				secondlargest = arr[i];
			}
		}
		System.out.println("Second largest is "+secondlargest);

	}

}
