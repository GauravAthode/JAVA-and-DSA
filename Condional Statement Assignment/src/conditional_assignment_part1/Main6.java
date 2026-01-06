package conditional_assignment_part1;

public class Main6 
{
	public static String checkEvenOdd(int num)
	{
		if(num%2==0)
		{
			return "Even number";
		}
		else 
		{
			return "Odd number";		
		}	
	}
	public static void main(String[] args) 
	{
		int num=0;
		String ans=checkEvenOdd(num);
		System.out.println(ans);
	}
}
