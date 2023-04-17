/*Write a program to print diamond traversal of an array?
Example : input : [[1,2,3],[4,5,6],[7,8,9]]
                 Output : 3 2 6 8*/
            
public class main
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int row = 3;
		int col = 3;
		int rowmid = (row/2);
		int colmid = (col/2);
		
		for(int i = col-1; i >=1; i--)
		{
			System.out.print(arr[0][i]+" ");
		}
		for(int i = row-1; i >=col-1; i--)
		{
			System.out.print(arr[colmid][i]+" ");
		}
		int f = rowmid+1;
		for(int i = col-2; i >= colmid; i--)
		{
			System.out.print(arr[f][i]+" ");
		}
      }
}                 

