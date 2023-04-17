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
		int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		//int row = 3;
		// int col = 3;
		String a = "";
		//String a1 = "";
		int k = 0;
		int n = 3;
		
		while(k < n)
		{
			for(int i = 0 ; i < n; i++)
			{
					a+=arr[i][k]+" ";
			}
			k++;	
			
			//System.out.print(a);
		}
		System.out.print("Col-wise"+":"+a);
		
		String a1 = "";
		int k1 = 0;
		//int n = 3;
		
		while(k1 < n)
		{
			for(int i = 0 ; i < n; i++)
			{
					a1+=arr[k1][i]+" ";
			}
			k1++;	
			
			
		}
		System.out.print("Row-wise"+":"+a1);
	}
}         

