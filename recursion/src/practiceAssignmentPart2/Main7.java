package practiceAssignmentPart2;

public class Main7
{
	public static int rev(int n,int rev)
	{
		if(n==0)
		{
			return rev;
		}
		int digit =n%10;
		return rev(n/10,rev*10+digit);
	}
	public static boolean ispelindrome(int n)
	{
		return n==rev(n, 0);
	}
	public static void main(String[] args) 
	{
		int n=12321;
		System.out.println(ispelindrome(n));
	}
}
