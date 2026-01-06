package practiceAssignmentPart2;

public class Main3 
{
	public static int findOdd(int n)
	{
		if(n==1)
		{
			 return 1;
		}
		return (2*n-1) +findOdd(n-1);
	}
	public static void main(String[] args) 
	{
		int n=5;
		System.out.println(findOdd(n));
	}
}
