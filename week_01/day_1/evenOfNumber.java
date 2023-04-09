public class evenOfNumber
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,4,6,5,1,8};
		int startArray = 0;
		int endArray = arr.length-1;
		
		//check the elements are order in even
		while(startArray < endArray)
		{
			while(arr[startArray] % 2 == 0)
			{
				startArray++;
			}
			while(arr[endArray] % 2 != 0)
			{
				endArray--;
			}
			//swap the elements in an array
			if(startArray < endArray)
			{
				int temp = arr[startArray];
				arr[startArray] = arr[endArray];
				arr[endArray] = temp;
				startArray++;
				endArray--;
			}
		}
		//print the elements in an array	
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print( arr[i] + ",");
		}
	
	
	}

}
