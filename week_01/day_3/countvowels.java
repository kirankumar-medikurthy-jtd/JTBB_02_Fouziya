public class countVowels
{
	public static void main(String[] args)
	{
		String str = "jtbfoundation";
		
		int vowels = 0;
		int consonents = 0;
		
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				vowels++;
			}
			else
			{
				consonents++;
			}
					
		
		}
		System.out.println(vowels);
		System.out.println(consonents);
		
		
		

	
	
	}
}
