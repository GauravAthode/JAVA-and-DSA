package switchStatementSheet;

public class Main10 
{
	public static void q10(int score)
	{
		int mark=score/10;
		switch (mark) 
		{
		case 10: 
		{
			System.out.println("A+");
			break;
		}
		case 9: 
		{
			System.out.println("A");
			break;
		}
		case 8: 
		{
			System.out.println("B");
			break;
		}
		case 7: 
		{
			System.out.println("C");
			break;
		}
		case 6: 
		{
			System.out.println("D");
			break;
		}
		default:
			System.out.println("F");
		}
	}

	public static void main(String[] args) 
	{
		int score=70;
		q10(score);

	}

}
