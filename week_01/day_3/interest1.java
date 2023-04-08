public class interest
{
	public static void main(String[] args)
	{
		int p = 1000;
		int i = 15;
		int t = 3;
		int perAnnum = 1;
	
		float simpleInterest = (p*i*t)/100;
	
		int result = (1+i/perAnnum);
		int c = perAnnum * t;
	
		double compound = p*Math.pow(result,c)-(p);
	
		System.out.println(simpleInterest);
		System.out.println(compound);
	}
}
		
