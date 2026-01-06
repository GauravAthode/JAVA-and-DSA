package conditional_assignment_part1;

public class Main5 
{
	public static boolean isDivisible(int num)
	{
		if(num%11==0 && num%5==0)
		{
			return true;
		}
		else 
		{
			return false;	
		}	
	}
	public static void main(String[] args) 
	{
		int num=12;
		boolean ans =isDivisible(num);
		System.out.println(ans);
	}
}
