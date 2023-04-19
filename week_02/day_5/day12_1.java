//Write a program to implement a stack  and its operations like push, pop, top of the stack using arrays?
//Example : Array = [2,3,4,5,6]

/*public class main
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,4,5,6};
		int [] stack = new int [100];
		int peek = -1;
		int start = -1;
		int numberOfOperation = input.nextInt();
		for(int i = 0; i < numberOfOPeration; i++)
		{
			String operation = input.next();
			if(operation.equal("push"))
			{
				int value = input.nextInt();
					peek+=1;
					stack[peek] = value;
			}
			else if (operation.equal("pop"))
			{
				peek-=1;
				
			}
			else if (operation.equal("peek"))
			{
				System.out.print(stack[peek]);
			}
			
		}
	}
}*/
//////////////////////////////
import java.util.Scanner;
public class day12_1
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("number of operations : ");
		int[] stack=new int[100];
		int peek=-1;
		
		int numofoperation=input.nextInt();
		
		for(int i = 0; i < numofoperation; i++)
		{
			//System.out.print("enter the operation : ");
			String operation=input.next();
			
			if(operation.equals("push"))
			{
				if(peek <= 100)
				{
					int value=input.nextInt();
					peek+=1;
					//System.out.print("enter the value : ");
					stack[peek]=value;
				}else
				{
					System.out.print("stack overflow");
				
				}
				
			}else if(operation.equals("pop"))
			{
				if(peek == -1)
				{
					System.out.print("Stack underflow");
				}else
				{
					System.out.print(stack[peek]);
					peek-=1;
				
				}
			}
			else if(operation.equals("peek"))
			{
				System.out.print(stack[peek]);
			}
		
		}
		for(int i = 0; i <= peek; i++)
		{
		System.out.print(stack[i]+" ");
		}	
	}

}
