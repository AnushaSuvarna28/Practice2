package MatrixPrograms;

public class Addition 
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
	int sum[][] = new int[a.length][a[0].length];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a[0].length;j++)
		{
			sum[i][j]= a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<sum.length;i++)
	{
		for(int j=0;j<sum[0].length;j++)
		{
			System.out.print(sum[i][j]+" ");
		}
		System.out.println();
	}
}
}
