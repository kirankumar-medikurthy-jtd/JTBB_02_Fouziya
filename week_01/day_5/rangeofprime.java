//Write a program to count the number of even prime numbers and odd prime numbers present in range of 1 to N?

public class Main 
{
    public static void main(String[] args)
    {
        int num= 100;
        int evenPrimeCount = 0;
        int oddPrimeCount = 0;
        
        	for (int i = 0; i <= num; i++) 
        	{
            		if (primeNumber(i)) 
            		{
                		if (i % 2 == 0) 
                		{
                    			evenPrimeCount++;
                		} else 
                		{
                    			oddPrimeCount++;
                		}
            		}
        	}	
        System.out.println("Number of even prime numbers between 1 and " + num + " is " + evenPrimeCount);
        System.out.println("Number of odd prime numbers between 1 and " + num+ " is " + oddPrimeCount);
    }

    public static boolean primeNumber(int n) 
    {
    	int count=0;
        for(int i = 1; i<=n; i++)
	 	{	
	 		if(n % i == 0)
	 		{
	 			count += 1;
	 		}	  
	   
	 	}
	 	if(count == 2)
	 	{
	  		return true;
	 	}else{
	 		return false;
	 	}
      	}
}
