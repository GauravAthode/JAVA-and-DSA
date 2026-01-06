package switchStatementSheet;

public class Main3 
{
	public static String q3(int month)
	{
		switch (month) 
		{
		case 1: 
		{
			return "january";
		}
		case 2: 
		{
			return "february";
		}
		case 3: 
		{
			return "march";
		}
		case 4: 
		{
			return "april";
		}
		case 5: 
		{
			return "may";
		}
		case 6: 
		{
			return "june";
		}
		case 7: 
		{
			return "july";
		}
		case 8: 
		{
			return "august";
		}
		case 9: 
		{
			return "september";
		}
		case 10: 
		{
			return "october";
		}
		case 11: 
		{
			return "november";
		}
		case 12: 
		{
			return "december";
		}
		default:
			return "input error";
		}
	}

	public static void main(String[] args) 
	{
		int month = 11;
		System.out.println(q3(month));
	}

}
