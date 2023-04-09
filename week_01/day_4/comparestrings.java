//Note : string 1 > string 2 : positive value
     // String1 == string2 : 0
     //string 1 < string 2 : Negative value
//Example : Input  :  string 1 = “jtd”  string 2 = “jtd”                      
            // Output :  0
public class main
{
	public static void main(String[] args)
	{
		String string1 = "swapna";
		String string2 = "muneera";
		
		int sum1 = 0;
		int sum2 = 0;
		
		int position1 = 0;
		int position2 = 0;
		int start = 0;
		int end = (string1.length() < string2.length())? string1.length() : string2.length();
		
		while(start < end){
			sum1 += (int) string1.charAt(position1);
			sum2 += (int) string2.charAt(position2);
			position1++;
			position2++;
			start++; 
		}
		if(sum1 > sum2)
		{
			System.out.println("positive value");
		}	
		else if(sum1 == sum2)
		{
			System.out.println("0");
		}
		else if(sum1 < sum2)
		{
			System.out.println("Nagetive value");
		}			
	}

}

