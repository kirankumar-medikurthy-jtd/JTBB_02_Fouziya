//Write a program to sort an array of 0’s, 1’s, and 2’s .
//Input : Array = [0,1,2,0,1,2]
//Output : [0,0,1,1,2,2]

public class value
{
	public static void main(String[] args)
	{
		int arr[] = {0,1,2,0,1,2};
		
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length; j++ )
			{
				if(arr[i] > arr[j])
				{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}	
		}
		for(int i = 0; i < arr.length; i++)
		{
		
		System.out.print(arr[i]+" ");
		}
	
	}
}


