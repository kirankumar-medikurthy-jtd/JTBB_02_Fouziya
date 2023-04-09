//Write a program to check if the sum of maximum and minimum elements present in an array is even number or odd number?
//Example : input :Array = [3,8,19,3,2,7,6], output :  “odd number”
public class main
{
	public static void main(String[] args)
	{
		int arr[] = {3,8,19,3,2,7,6};
		
		int firstMin = Integer.MAX_VALUE;
		
		//run the loop for min value
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < firstMin)
			{
				firstMin = arr[i];
			}
		}
		System.out.println(firstMin);
		
		int firstMax = Integer.MIN_VALUE;
		
		//run the loop for max value
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > firstMax)
			{
				firstMax = arr[i];
			}
		
		}
		System.out.println(firstMax);
		
		int sum = firstMin + firstMax;
		
		//check it is even or odd
		
		if(sum % 2 == 0){
			
			System.out.println(sum+" "+"even number");
		}
		else
		{
			System.out.println(sum+" "+"odd number");
		}		
	}

}













