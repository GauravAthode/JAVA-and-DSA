package practiceAssignmentPart2;

public class Main8 
{
	public static int count(int n,int count)
	{
		if(n==0)
		{
			return count;
		}
		n/=10;
		count++;
		return count(n,count);
	}
	public static int addNumber(int n)
	{
		int power=count(n,0);
		if(n==0)
		{
			return 0;
		}
		return addNumber(n/10);
	}
	
	public static boolean isArmstrong(int n)
	{
		return n== addNumber(n);	
	}

	public static void main(String[] args) 
	{
		int n=3771;
		System.out.println(isArmstrong(n));
		
	}
}
