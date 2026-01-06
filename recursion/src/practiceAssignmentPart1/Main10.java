package practiceAssignmentPart1;

public class Main10 
{
	public static int findfactorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return findfactorial(n-1)*n;
	}
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return findfactorial(n%10)+factorial(n/10);
	}
	public static boolean isStront(int n)
	{
		return factorial(n)==n;
	}
	public static void main(String[] args)
	{
		int n=145;
		if(isStront(n))
		{
			System.out.println(n+" is a strong number");
		}
		else 
		{
			System.out.println(n+" is not a strong number");
		}
	}
}
