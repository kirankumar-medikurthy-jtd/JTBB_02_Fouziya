//write a program to print occurance or frequency of each element present in an array.
//Inpit : arr[1,2,3,4,5,2,1,3,2];
//output : 1:2,2:3,3:2,4:1,5:1;

public class frequency
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,2,1,3,2};
		
		//Taking result array with size of max element present in an array
		int []result = new int[10];//you can take also[1000]
		for(int i = 0; i < arr.length; i++)
		{
			result[arr[i]]+=1;
			
		}
		
		//print the value along it frequency of an element
		for(int i = 0; i < result.length; i++)
		{
			if(result[i] >= 0)
			{
				System.out.println("element :"+i+"occurance:"+result[i]);
			}
		}
	}
}


