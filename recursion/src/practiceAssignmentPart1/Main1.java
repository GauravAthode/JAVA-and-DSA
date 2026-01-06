package practiceAssignmentPart1;

public class Main1 
{
	public static void printIncreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		printIncreasing(n-1);
		System.out.print(n+" ");
	}
	public static void main(String[] args) 
	{
		int n=5;
		printIncreasing(n);
	}
}
