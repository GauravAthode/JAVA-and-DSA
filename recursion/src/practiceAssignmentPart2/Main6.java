package practiceAssignmentPart2;

public class Main6 
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

	public static void main(String[] args) 
	{
		int n=123;
		System.out.println(rev(n, 0));
	}
}
