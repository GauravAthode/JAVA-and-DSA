package conditional_assignment_part2;

public class Main12 
{
	public static String printMonthName(int input)
	{
		if(1==input)
		{
			return "january";
		}
		else if(2==input)
		{
			return "february";
		}
		else if(3==input)
		{
			return "march";
		}
		else if(4==input)
		{
			return "april";
		}
		else if(5==input)
		{
			return "may";
		}
		else if(6==input)
		{
			return "june";
		}
		else if(7==input)
		{
			return "july";
		}
		else if(8==input)
		{
			return "august";	
		}
		else if(9==input)
		{
			return "september";	
		}
		else if(10==input)
		{
			return "october";	
		}
		else if(11==input)
		{
			return "november";	
		}
		else if(12==input)
		{
			return "december";	
		}
		else 
		{
			return "input error";	
		}
	}

	public static void main(String[] args) 
	{
		int input=6;
		System.out.println(printMonthName(input));
	}
}
