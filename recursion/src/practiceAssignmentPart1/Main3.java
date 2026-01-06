package practiceAssignmentPart1;

public class Main3 
{
	public static void increasingDecreasing(int n,int curr)
	{
		if(curr>n)
		{
			return;
		}
		System.out.print(curr+" ");
		increasingDecreasing(n,curr+1);
		System.out.print(curr+" ");
	}
	public static void main(String[] args) 
	{
		int n=3;
		increasingDecreasing(n,1);
	}
}
