package PackAllQuestion;

public class Main4 
{
	public static void multiplication(int x)
	{
		for(int i=1; i<=10; i++ )
		{
			int multply=i*x;
			System.out.println(i+"*"+x+" = "+ multply);
		}
		
	}
	public static void main(String[] args)
	{
		int x=7;
		multiplication(x);
		
	}

}
