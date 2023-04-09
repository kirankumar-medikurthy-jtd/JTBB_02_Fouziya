//Write a program for 90 degrees  rotation of  all elements present in a 2d array?
//Example : Input 1 : [[1 3  4]
                    // [6 3 2]
                     //[9 2 10]]                          
                    //Output1 :  [[9 ,6, 1],[2,3,3],[10,2,4]]  
public class degree 
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,3,4},{6,3,2},{9,2,10}};
		int row = 3;
		int col = 3;
		
		for(int i = row-1; i >= 0; i--)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int j = row-1; j >= 0; j--)
		{
			System.out.print(arr[j][1]+" ");
		}
		for(int k = row-1; k >= 0; k--)
		{
			System.out.print(arr[k][2]+" ");
		}
	
	}

}                    
                    


