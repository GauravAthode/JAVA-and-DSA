package practiceAssignmentPart1;

public class Main6 
{
	public static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		return factorial(n-1)*n;
	}

	public static void main(String[] args) 
	{
		int n=5;
		System.out.println(factorial(n));	
	}
}
