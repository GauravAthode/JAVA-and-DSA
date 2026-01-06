package switchStatementSheet;

public class Main6 
{
	public static void q6(int day)
	{
		switch (day) 
		{
		case 1: 
		{
			System.out.println("weekend day");
			break;
		}
		case 7: 
		{
			System.out.println("weekend day");
			break;
		}
		default:
			System.out.println("Not weekend day");
		}
	}
	public static void main(String[] args) 
	{
		int day = 7;
		q6(day);
	}
}
