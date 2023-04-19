/*Write a program to decipher the string?
Example : input1: a2b1c2d3e2
                 Output : “aabccdddee”*/
                 
public class main
{
	public static void main(String[] args)
	{
		String str = "a2b1c2d3e2";
		String str1 = "";
		
		for(int i = 1; i < str.length(); i++) 
		{
			if(i % 2 == 1)
			{
				int number = Character.getNumericValue(str.charAt(i));
				for(int j = number; j > 0; j--)
				{
					str1+=str.charAt(i-1);
				}
			}
			
           		
        	}
        	System.out.println(str1);
	
	}

}  
                  

