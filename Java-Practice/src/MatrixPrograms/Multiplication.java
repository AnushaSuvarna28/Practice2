package MatrixPrograms;

public class Multiplication 
{
	public static void main(String[] args) 
	{
		int a[][] = {
				{1,2,3},
				{4,5,6}
				};
	int b[][] = {
				{1,3,6},
				{5,2,8}
				};
	int mul[][] = new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++)
	{
		int sum = 0;
		for(int j=0;j<a.length;j++)
		{
			sum = sum+a[i][j]*b[i][j];
		}
		for(int k=0;k<a.length;k++)
		{
			mul[i][k]=sum;
		}
	}
	for(int i=0;i<mul.length;i++)
	{
		for(int j=0;j<mul[0].length;j++)
		{
			System.out.print(mul[i][j]+" ");
		}
		System.out.println();
	}
	}
}
