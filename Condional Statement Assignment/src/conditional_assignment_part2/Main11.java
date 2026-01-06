package conditional_assignment_part2;

public class Main11 
{
	public static String printWeekday(int input)
	{
		if(1==input)
		{
			return "Monday";
		}
		else if(2==input)
		{
			return "Tuesday";
		}
		else if(3==input)
		{
			return "Wednesday";
		}
		else if(4==input)
		{
			return "Thursday";
		}
		else if(5==input)
		{
			return "Friday";
		}
		else if(6==input)
		{
			return "Saturday";
		}
		else if(7==input)
		{
			return "Sunday";
		}
		else 
		{
			return "input error";	
		}
	}
	public static void main(String[] args) 
	{
		int input=1;
		System.out.println(printWeekday(input));
	}
}
