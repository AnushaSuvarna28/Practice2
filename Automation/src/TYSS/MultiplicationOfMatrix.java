package TYSS;

public class MultiplicationOfMatrix 
{
public static void main(String args[])
{
	int a[][] = {
				{1,1,1},
				{2,2,2},
				{3,3,3}
				};
	int b[][] = {
			{1,1,1},
			{2,2,2},
			{3,3,3}
			};
	int mul[][] = new int[3][3];
	for(int i=0;i<a.length;i++)
	{
		int sum = 0;
		for(int j=0;j<b.length;j++)
		{
			sum = sum+a[i][j]*b[j][0];
		}
		for(int k=0;k<a.length;k++)
		{
			mul[i][k] = sum;
		}
		
	}
	for(int i=0;i<mul.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.print(mul[i][j]+" ");
		}
		System.out.println();
	}
}		
}
