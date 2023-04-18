package Array;

public class LargestElement 
{

	public static void main(String[] args) 
	{
	   int a[] = {1,4,200,7,56,90,32};
	   int largest = a[0];
	   for(int i=0;i<a.length;i++)
	   {
		if(a[i]>largest)
		{
			largest = a[i];
		}
	   }
	   System.out.println("Largest element is "+largest);
	}

}
