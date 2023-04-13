//DAY 8 seventh problem
/*Two common ways of traversing a matrix are row-major-order and column-major-order. 
Input : mat[][] = {{1, 2, 3}, 
                   {4, 5, 6}, 
                   {7, 8, 9}}
Output : Row-wise: 1 2 3 4 5 6 7 8 9
               Col-wise : 1 4 7 2 5 8 3 6 9*/
               
public class main
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3,},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		for(int i = 0; i < col; i++ )
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int i = 0; i < col; i++ )
		{
			System.out.print(arr[1][i]+" ");
		}
		for(int i = 0; i < col; i++ )
		{
			System.out.print(arr[2][i]+" ");
		}
		
		for(int i = 0; i < row; i++ )
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int i = 0; i < row; i++ )
		{
			System.out.print(arr[i][1]+" ");
		}
		for(int i = 0; i < row; i++ )
		{
			System.out.print(arr[i][2]+" ");
		}
		
	}
}               

