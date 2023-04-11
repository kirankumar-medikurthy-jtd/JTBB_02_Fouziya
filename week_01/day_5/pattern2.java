/*Write a program to print below pattern
*
*_ *
*_*_*
*_*_*_* */


public class main
{
	public static void main(String[] args)
	{
		int num = 4;
		for(int i = 1; i <= num; i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i == j)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print("*_");
				}
			}
			System.out.println();
		}
	}
}

