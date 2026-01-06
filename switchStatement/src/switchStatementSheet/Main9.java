package switchStatementSheet;

public class Main9 
{
	public static void q9(String animal)
	{
		switch (animal) 
		{
		case "dog": 
		{
			System.out.println("mammal");
			break;
		}
		case "crow": 
		{
			System.out.println("bird");
			break;
		}
		default:
			System.out.println("inpuut error");
			break;
		}
	}
	public static void main(String[] args) 
	{
		q9("dog");
	}
}
