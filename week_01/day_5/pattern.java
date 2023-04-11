//Write a program to print bellow pattern
/* * * * *
 *     *
 *     *
 * * * *  */

public class main
{
 	 public static void main(String[] args)
 	 {
		 int n=4;
 		 for(int i=1;i<=n;i++)
 		 {
      			String value="";
     			for(int j=1;j<=n;j++)
     			{
     				if(i == 1 || j == 1 || i == n || j == n)
     				{
     				value=value+"*";
     				}
     				else 
     				{
     				value=value+" ";
     				}
  

			}
 			System.out.println(value);
		}
 	 }
}
