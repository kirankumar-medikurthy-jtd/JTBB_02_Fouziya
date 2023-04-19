//write a program to cipher the string 
//str:"aabccdddee";
//output : a2b1c2d3e2

public class test19
{
	public static void main(String[] args)
	{
		String str = "aabccdddee";
		
		for(int i = 0; i < str.length(); i++)
		{
			int count = 1;
			boolean c1 = false;
			
			for(int j = 0; j < i; j++)
			{
				if(str.charAt(j) == str.charAt(i))
				{
					c1 = true;
					break;
				}
			}
			if(!c1)
			{
				for(int j = i+1; j < str.length(); j++)
				{
					if(str.charAt(j) == str.charAt(i))
					{
						count++;
					}	
				}
				System.out.print(str.charAt(i)+""+count);
			}
		}
		
	}
}
