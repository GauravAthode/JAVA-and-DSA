package practiceAssignmentPart2;

public class clone6 
{
	public static void rev(int n)
	{
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			int number = rev*10+rem;
			n=n/10;
			System.out.print(number);
		}	    
	}
	public static void main(String[] args)
	{
		int n=123;
		rev(n);
		
	}

}
