package practiceAssignmentPart2;

public class Main4 
{
	public static void decimalToBinary(int n)
	{
		if(n==0)
		{
			return;
		}
		decimalToBinary(n/2);
		System.out.print(n%2);
	}
	public static void main(String[] args) 
	{
		int n= 8;
		if(n==0)
		{
			System.out.println(n);
		}
		else
		{
			decimalToBinary(n);
		}
	}
}
