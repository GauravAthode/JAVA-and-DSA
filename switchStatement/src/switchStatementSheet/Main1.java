package switchStatementSheet;

public class Main1 
{
	public static String q1(int weekday)
	{
		int week = weekday%7;
		switch (week) 
		{
		case 0: 
		{
			return "Sunday";
		}
		case 1: 
		{
			return "Monday";
		}
		case 2: 
		{
			return "Tuesday";
		}
		case 3: 
		{
			return "Wednesday";
		}
		case 4: 
		{
			return "Thursday";
		}
		case 5: 
		{
			return "Friday";
		}
		case 6: 
		{
			return "Sunday";
		}
		default:
			return "input error";
		}
	}
	public static void main(String[] args) 
	{
		int weekday = 18;
		System.out.println(q1(weekday));
	}
}
