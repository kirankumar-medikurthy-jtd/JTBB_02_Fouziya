//Write a program to print all the element in a string in the form “C” pattern in a 2D array
//Input : Array = [[1,2,3],[4,5,6],[7,8,9]]
//Output : 1 2 3 4 7 8 9
//3,2,1,4,7,8,9

public class C
{
	public static void main(String[] args)
	{
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		
		for(int i = row-1; i >= 0; i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int j = 1; j < col; j++ )
		{
			System.out.print(arr[j][0]+" ");
		}
		for(int i = 1; i < row; i++ )
		{
			System.out.print(arr[2][i]+" ");
		}
	}
}

