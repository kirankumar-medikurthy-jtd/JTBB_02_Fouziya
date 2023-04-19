/*Write a program to cipher the string?
 Example : input : str = “aabccdddee”
                  Output : a2b1c2d3e2*/
/*public class main
{
	public static void  main(String[] args)
	{
		String str = "a,a,b,c,c,d,d,d,e,e";
		//char [] strArray = str.toCharArray();
		String str1 = "";
		int count = 0;
		for(int i = 0; i < str.length(); i++)
		{
			count++;
			if(str.charAt(i)!=str.charAt(i+1))
			{
			str1+=str.charAt(i)+count;
			count=0;
			}
		}
		System.out.print(str1);
		
		
	}
}*/

public class main
{
	public static void main(String[] args)
	{
		String str = "aabccdddee";
		for(int i = 0; i < str.length(); i++) 
		{
           		 int count = 1;
           		 boolean count1 = false;
           		 for(int j = 0; j < i; j++) 
           		 {
               			 if(str.charAt(j) == str.charAt(i)) 
               			 {
                   			 count1 = true;
                    			 break;
               			 }
            		}
            		if(!count1) 
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
 
