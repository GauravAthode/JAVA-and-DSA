package PackAllQuestion;

public class Main10 
{
	public static String check(int age)
	{
		return age>=18? "eligible to vote" : "not  eligible to vote";	
	}
	public static void main(String[] args) 
	{
		int age = 17;
		System.out.println(check(age));
	}
}
