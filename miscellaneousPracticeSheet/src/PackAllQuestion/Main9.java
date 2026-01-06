package PackAllQuestion;

public class Main9 
{
	public static String check(int value)
	{	
		return value>0?"positive":value<0? "negative":"neutral";
	}
	public static void main(String[] args)
	{
		int value=56;
		System.out.println(check(value));
	}

}
