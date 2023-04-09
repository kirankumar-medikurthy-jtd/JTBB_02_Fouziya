public class reverseString
{
	public static void main(String[] args)
	{
		//take a string
		String str = "Helloworld Java";
		//string is converted into charecter array
		char[] strArray = str.toCharArray();
		 
		int start = 0;
		int end = str.length()-1;
		//run the loop
		while( start < end )
		{
			//swap the each and every charecter from startpoint to end
			char temp = strArray[start];
			strArray[start] = strArray[end];
			strArray[end] = temp;
			start++;
			end--;
		
		}
		//output will be print
		System.out.println(strArray);
	
	
	
	
	}


}
