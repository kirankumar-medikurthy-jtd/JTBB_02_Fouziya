//Write a program for  removing the leading zero present in a string  
//Example : Input  : 00000123569 
               // Output :  123569

public class removzero
{
	public static void main(String[] args)
	{
		String str = "00000123569";
		String result = "";
		//int start = 0;
		
		
		while(i < str.length() && str.charAt(i) == '0')
		{
			start++;
		}
	//for(int i = 0; i < str.length(); i++)
		//{
				//result+=str.charAt(i);
				result += str.charAt(i);
		//}
		
		System.out.println(result);
		
	}




 
 }
