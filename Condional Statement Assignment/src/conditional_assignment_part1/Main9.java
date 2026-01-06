package conditional_assignment_part1;

public class Main9 
{
	public static String checkCase(char ch)
	{
		if(ch<=ch&&122>=ch)
		{
			return "Uppercase";
		}
		else if(65<=ch&& 90>=ch)
		{
			return "Lowercase";
		}
		else {
			return " Not an alphabet";
		}	
	}
	public static void main(String[] args) 
	{
		char ch='A';
		System.out.println(checkCase(ch));
	}
}
