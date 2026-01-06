package practiceAssignmentPart2;

public class Main10
{
	public static int factorSum(int n , int i)
	{
		if(i==0)
		{
			return 0;
		}
		if(n%i==0)
		{
			return i+factorSum(n, i-1);
		}
		return factorSum(n, i-1);
	}
	public static boolean perfect(int n)
	{
		return n==factorSum(n,n-1);
	}
	
	public static void main(String[] args)
	{
		int n=6;
		if(perfect(n))
		{
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}
	}
}
