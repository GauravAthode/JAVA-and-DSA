package conditional_assignment_part1;

public class Main6 
{
	public static String checkEvenOdd(int num)
	{
		return num%2==0? "Even number" : "Odd number";
	}
	public static void main(String[] args) 
	{
		int num=0;
		String ans=checkEvenOdd(num);
		System.out.println(ans);
	}
}