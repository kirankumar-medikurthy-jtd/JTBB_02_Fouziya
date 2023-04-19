/*Write a program to print the next greater element present in an array?
Example : Input: arr[] = [ 4 , 5 , 2 , 25 ]
                Output:  4      –>   5
                         5      –>   25
                         2      –>   25
                         25     –>   -1*/
                         
public class day12_2
    {    
	    public static void main(String argvs[])  
	    {  
		    int[] arr={4,5,2,25};
		      
		    int size = arr.length; 
		     
		    for(int i = 0; i < size; i++)  
		    {  
		    		int temp = -1;  
		    		
		    	for(int j = i + 1; j < size; j++)  
		    	{  
				if(arr[j] > arr[i])  
				{  
				   temp = arr[j]; 
				   break   ;
				}  
			  
			}  
			if(temp != -1)  
			{  
			    System.out.println( arr[i] + " ->  " + temp);  
			}  
			    else  
			{  
			    System.out.println( arr[i] + "->  -1 ");  
			}  
		    }  
	    }  
    }
