package switchStatementSheet;

public class Main5 
{
	public static void q5(char color)
	{
		switch (color) 
		{
		case 'R': 
		{
			System.out.println("Red");
			break;
		}
		case 'G': 
		{
			System.out.println("Green");
			break;
		}
		case 'B': 
		{
			System.out.println("Blue");
			break;
		}
		default:
			System.out.println("input error");		
		}
	}
	public static void main(String[] args) 
	{
		char color = 'R';
		q5(color);
	}
}