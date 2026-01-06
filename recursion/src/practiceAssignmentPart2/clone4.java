package practiceAssignmentPart2;

public class clone4 
{
	public static void findDecimal(int n)
	{
		while(n>0)
		{
			int remainder=n%2;
			System.out.print(remainder+ " ");
			n=n/2;
		}
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		int n=8;
		findDecimal(n);
	}
}
