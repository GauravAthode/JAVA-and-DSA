package conditional_assignment_part1;

public class Main4 
{
	public static String checkNumber(int num)
	{
		return num>0? "positive number" : 
			   num<0? "Negative number" : "The number is zero";
	}
	public static void main(String[] args) 
	{
		int num=10;
		String ans=checkNumber(num);
		System.out.println(ans);
	}
}

