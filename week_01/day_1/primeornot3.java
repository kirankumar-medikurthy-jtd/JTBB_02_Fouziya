public class primeornot
{
	public static void main(String[] args)
	{
		//take the number to intialise
		int number = 14;
		// to take another variable to count the number
		int count = 0;
		//run the loop
		for(int i = 1; i <= number; i++ )
		{
			//After loop will be run then check the number is divisible or not
			if(number % i == 0)
			{
				//increment the value 
				count++;
			}
				
		}
		//After completed the loop run and if condition then check the divisible by the count value number
		if(count == 2)
		{
			System.out.println("Prime Number");
		}
			
		else
		{
			System.out.println("Not Prime Number");
		}	
	
	}

}
