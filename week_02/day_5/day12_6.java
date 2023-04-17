//Write a program to print the array element in the pattern below?
           // Example : input  : String str = “JCEP”
public class day12_6
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 5;
		int col = 5;
		int rowmid = (row/2);
		int colmid = (col/2);
		//print J
		for(int i = 0; i < row; i++)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int j = 1; j < col; j++)
		{
			System.out.print(arr[j][colmid]+" ");
		}
		for(int i = colmid-1; i >=0; i--)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		System.out.print(".......J.........");
		//print C
		for(int i = row-1; i>=0; i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int j = 1; j < row; j++)
		{
			System.out.print(arr[j][0]+" ");
		}
		for(int i = 1; i < row; i++)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		System.out.print("........C........");
		//print E
		for(int i = col-1; i>=0; i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int j = 1; j < col; j++)
		{
			System.out.print(arr[j][0]+" ");
		}
		for(int i = 1; i < row; i++)
		{
			System.out.print(arr[row-1][i]+" ");
		}
		for(int j = 2; j < col-1 ; j++)
		{
			System.out.print(arr[row-1][j]+" ");
		}
		System.out.print("......E........");
		//print P
		for(int i = 0; i < row; i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int j = 1; j < col; j++)
		{
			System.out.print(arr[0][j]+" ");
		}
		for(int i = 1; i <= rowmid; i++)
		{
			System.out.print(arr[i][col-1]+" ");
		}
		for(int j = rowmid; j >=1; j--)
		{
			System.out.print(arr[colmid][j]+" ");
		}
		System.out.print("......P........");
	}
}
