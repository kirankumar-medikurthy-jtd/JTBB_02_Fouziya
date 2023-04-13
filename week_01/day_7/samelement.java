/*Write a program to find a common element present in three sorted arrays .
Input: 
ar1[] = {1, 5, 10, 20, 40, 80} 
ar2[] = {6, 7, 20, 80, 100} 
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120} 
Output: 20, 80 */

class comonelement
{
	public static void main(String[]args)
	{
		int[]arr1={1, 5, 10, 20, 40, 80};
		int[]arr2= {6, 7, 20, 80, 100};
		int[]arr3={3, 4, 15, 20, 30, 70, 80, 120};
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				for(int k = 0; k < arr3.length; k++) 
				{
					if(arr1[i] == arr2[j] && arr1[i] == arr3[k])
					{
						System.out.print(arr1[i]+" ");
					}
				}
			}
			
		}
			
	}
		
}








/*public class samelement
{
	public static void main(String[] args)
	{
		int arr1[] = {1, 5, 10, 20, 40, 80};
		int arr2[] = {6, 7, 20, 80, 100}; 
		int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		String str = "";
		String str1 = "";
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					str+=arr1[i]+" ";
				}
			}
			for(int f = 0; f < arr3.length; f++)
			{
				if(arr1[i] == arr3[f])
				{
					str1+=arr1[i]+" ";
				}
			}	
		} 
		if(str == str1)
		{
			System.out.println(str);
		}
		
		
	}
}*/

