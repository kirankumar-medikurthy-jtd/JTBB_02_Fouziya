public class main
{
	public static void main(String[] args)
	{
		int [][] array = {{1,3,4},{6,3,2},{9,2,10}};
		int row = 3;
		int column =3;
		
		//first column traversal of elements
		for(int i = row-1; i >= 1; i--)
		{
			System.out.print(array[i][0]+" ");
		}
		//left diagonal traversal of elements;
		int i = 0;
		int j = 0;
		while(i < row-1 && j < column-1)
		{
			System.out.print(array[i++][j++]+" ");
		}
		//last column traversal
		for(int k = row-1; k >= 0; k--)
		{
			System.out.print(array[k][column-1]+" ");
		}	
		
	
	
	}

}
                          
                                          
