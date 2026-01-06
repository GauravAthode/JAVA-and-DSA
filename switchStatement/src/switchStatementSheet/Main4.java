package switchStatementSheet;

public class Main4 
{
	public static void q4(char side)
	{
		switch (side) 
		{
		case 'N': 
		{
			System.out.println("North");
			break;
		}
		case 'S': 
		{
			System.out.println("South");
			break;
		}
		case 'E': 
		{
			System.out.println("East");
			break;
		}
		case 'W': 
		{
			System.out.println("West");
			break;
		}
		default:
			System.out.println("input error");		
		}
	}
	public static void main(String[] args) 
	{
		char side = 'N';
		q4(side);
	}
}
