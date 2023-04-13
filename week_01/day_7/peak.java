/*Write a program to find a peak element, which is not smaller than its neighbors
Input : array[] = {5,10,20,15}*/


public class main
{
	public static void main(String[] args)
	{
		int arr[] = {5,10,20,15};
		
		for(int i = 1; i < arr.length; i++)
		{
			if(arr[i] > arr[i-1] && arr[i] > arr[i+1])
			{
			System.out.println(arr[i]);
			
			}
		}
	}
}

