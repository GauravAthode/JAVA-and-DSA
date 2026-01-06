package conditional_assignment_part2;

public class Main18 
{
	public static int numberOfYears(int year,int join)
	{
		System.out.println("Current Year: "+year);
		System.out.println("Year of joining: "+join);
		int served=year-join;
		return served;
	}
	
	public static void main(String[] args)
	{
		int year=2024;
		int join=2016;
		int result=numberOfYears(year,join);
		System.out.println("Year served = "+result+" years");
		if(result>3)
		{
			System.out.println("The employee is eligible for a bonus of Rs. 2500.");
		}
		else
		{
			
		}
	}
}
