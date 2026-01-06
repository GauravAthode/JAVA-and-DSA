package practiceAssignmentPart1;

public class Main9 
{
	public static int sumOfDigits(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return sumOfDigits(n/10)+n%10;
	}
	public static void main(String[] args) 
	{
		int n=1234;
		System.out.println(sumOfDigits(n));
	}
}
