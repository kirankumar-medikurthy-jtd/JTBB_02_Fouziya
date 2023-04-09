//Write a program to print the array element in the pattern below(i.e swastika pattern)?
  //Example : input  : Array = [[1,2,3],[4,5,6],[7,8,9]]
     //Output =  1 4 5 6 9 7 8 5 2 3

public class swastika
{
        public static void main(String[] args) 
	{
		int [][] arr = { {1,2,3} , {4,5,6} , {7,8,9} };
		//int [][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25,}};
		int row = 3; 
		int col = 3; 
		int rowmid = (row/2);
		int colmid = (col/2);
		
		
		for(int i = 0; i < rowmid; i++)
		{
			System.out.print(arr[i][0]+" ");
			
		}
		for(int j = 0; j < col; j++)
		{
			System.out.print(arr[rowmid][j]+" ");
		}
		for(int i = rowmid+1; i < row; i++)
		{
			System.out.println(arr[i][col-1]+" ");
		}
		for(int j = 0; j <colmid; j++)
		{
			System.out.print(arr[row-1][j]+" ");
		}
		for(int i = row-1; i >= 0; i--)
		{
			System.out.print(arr[i][colmid]+" ");
		}
		for(int j = colmid+1; j < col; j++)
		{
			System.out.print(arr[0][j]+" ");
		}
			
		
       	}

}
