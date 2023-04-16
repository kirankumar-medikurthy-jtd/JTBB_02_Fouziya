class oddPalindrome
{
	public static void main(String[] args)
	{ 
		String str = "madam speak malayalam fluently";
		
		int start  = 0;
		int prePoint = 0;
		
		
		while(start < str.length())
		{
			while(start < str.length() && str.charAt(start) != ' ')
			{
				start ++;
			}
			String temp = str.substring(prePoint,start);
			
			
			
			// checking the if the word is oddlengthpalindrome or not
			if(temp.length() % 2 != 0 && Palindrome(temp))
			{
				System.out.println(temp);
			}
			// calling the ReverseWord function here*/
            		
			
			start = start + 1;
			prePoint = start;
		}
		
	 }
	
	//checking the palindrome
	public static boolean Palindrome(String str)
	{
		int start = 0;
		int end = str.length()-1;
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start ++;
			end --;
		}
		return true;
	}
	 
		
}
