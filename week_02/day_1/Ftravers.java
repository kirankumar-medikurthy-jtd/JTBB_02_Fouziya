/*Write a program to print all the elements present in the matrix in “F” traversal.
             Input : mat[][] = {{1, 2, 3}, 
                            {4, 5, 6}, 
                           {7, 8, 9}}
Output: 1 2 3 4 5  7 */

public class Ftravers
{
	public static void main(String[] args)
	{
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int row = 3;
		int col = 3;
		
		for(int  i = 0; i < row; i++)
		{
			System.out.print(arr[0][i]+" ");
		}
		
		for(int  i = 0; i < row-1; i++)
		{
			System.out.print(arr[1][i]+" ");
		}
		
		for(int  i = 0; i <= row-3; i++)
		{
			System.out.print(arr[2][i]+" ");
		}
		
	}
}
