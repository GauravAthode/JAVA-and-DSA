package conditional_assignment_part1;

public class Main4 
{
	public static String checkNumber(int num)
	{
		if(num>0)
		{
			return "positive number";
		}
		else if(num<0)
		{
			return "Negative number";
		}
		else
		{
			return "The number is zero";
		}
	}
	public static void main(String[] args) 
	{
		int num=10;
		String ans=checkNumber(num);
		System.out.println(ans);
	}
}
