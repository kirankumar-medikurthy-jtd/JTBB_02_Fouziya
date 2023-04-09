public class productofarray
{
	public static void main(String[] args)
	{
		int arr[] = {2,2,5};
		int number = 1;
		
		for(int i=0; i<arr.length; i++)
		{
			number*=arr[i];
			
		}
		System.out.println(number);
	
	}

}
