/*Write a program for 90 degrees  rotation of  all elements present in a 2d array in anti-clockwise direction in place?
Example : Input 1 : [[1 3  4]
                     [6 3 2]
                     [9 2 10]]                          
Output1 :  [[10 ,2, 4],[2,3,3],[9,6,1]]  */

public class day12_7
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,3,4},{6,3,2},{9,2,10}};
		int row = 3;
		int col = 3;
		String anti = "";
		int i =col-1;
		while(i>= 0)
		{
			
			for(int j = row-1; j >=0; j--)
			{
				anti += arr[j][i]+" ";
			}
			i--;
		}
		System.out.print(" "+anti);
	
	}
}


