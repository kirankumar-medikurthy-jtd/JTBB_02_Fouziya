/*Write a program to find intersection of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Intersection : {3, 5}*/

public class main
{
	public static void main(String[] args)
	{
		int arr1[] = {1,3,4,5,7};
		int arr2[] = {2,3,5,6};
		//String ar = "";
		
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.print(arr1[i]+" ");	
				}
				
			}
		}
		
	}
}

