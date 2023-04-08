class substringcount
{
	public static void main(String[] args)
	{
		String str = "bootcamp";
		int fouz = str.length();
		int count = 0;
		for(int i = 0;i<fouz;i++)
		{
			for(int j=i;j<=fouz-1;j++)
			{
				count++;
				
			}
		}
		System.out.println(count);
		
	}
}

