package arrays;

public class FrequencyOfOddEvenNos 
{
	public static void main(String[] args) 
	{
		int a[][] = {
						{1,2,3},
						{4,5,6},
						{1,2,5}
					};
		int even = 0;
		int odd = 0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if(a[i][j]%2==0)
				{
					even++;
				}
				else
				{
					odd++;
				}
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}
}
