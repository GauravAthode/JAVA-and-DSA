package conditional_assignment_part2;

public class Main18 
{
	public static int numberOfYears(int year, int join)
	{
		int served =year-join;
		return served;	
	}
	public static void main(String[] args) 
	{
		int year=2024;
		int join=2014;
		int result =numberOfYears(year, join);
		System.out.println(result>3? "The employee is eligible for a bonus of Rs. 2500" : "No bonus");
	}
}
