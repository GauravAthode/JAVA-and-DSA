package switchStatementSheet;

public class Main2 
{
	public static void q2(char gender)
	{
		switch (gender) 
		{
		case 'M': 
		{
			System.out.println("Male");
			break;
		}
		case 'F': 
		{
			System.out.println("Female");
			break;
		}
		default:
			System.out.println("input error");		
		}
	}
	public static void main(String[] args) 
	{
		char gender = 'M';
		q2(gender);
	}
}
