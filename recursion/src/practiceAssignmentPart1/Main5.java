package practiceAssignmentPart1;

public class Main5 
{
	public static void findRangeSum(int n1,int n2,int i)
	{
		if(n2==i)
		{
			n1+=i;
			System.out.println(n1);
			return;
		}
		n1+=i;
		findRangeSum(n1, n2, i+1);	
	}
	public static void main(String[] args)
	{
		int number1=3;
		int number2=7;
		findRangeSum(number1,number2,number1+1);
	}
}

