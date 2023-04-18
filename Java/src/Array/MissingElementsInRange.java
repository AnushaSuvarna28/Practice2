////find missing element in integer array of 1-10

package Array;
public class MissingElementsInRange 
{

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7,8,10};

		//sum of 1-10
		int sum1 = 0;
		for(int i=1;i<=10;i++)
		{
			sum1 = sum1+i;
		}
		System.out.println(sum1);
		
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			sum2 = sum2+a[i];
		}
		System.out.println(sum2);
		
		int misnum = sum1-sum2;
		System.out.println(misnum);
	}

}
