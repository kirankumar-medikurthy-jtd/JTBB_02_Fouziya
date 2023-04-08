public class main
{
	public static void main(String[] args)
	{
		int arr[] = {2,3,4,6,8,1};
		int target = 13;
		System.out.println(targetValue(arr,target));
		
	
	}
	public static String targetValue(int[] arr,int target)
	{
		String flag = "no "+"not equal ";
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j < arr.length-1; j++ )
			{
				for(int k = j + 1; k < arr.length-1; k++)
				
				if(arr[i]+arr[j]+arr[k] == target)
				{
					flag = "the target output"+" "+i+","+j+","+k+" : "+"targetvalue"+" : "+target;
					break;
				}
			}
		}
		return flag;
	}
}
