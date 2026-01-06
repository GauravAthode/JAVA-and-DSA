package conditional_assignment_part1;

public class Main9 
{
	public static String checkCase(char ch)
	{	
		return ch<=ch&&122>=ch? "Uppercase" : 
			   65<=ch&& 90>=ch? "Lowercase" : " Not an alphabet";
	}
	public static void main(String[] args) 
	{
		char ch='A';
		System.out.println(checkCase(ch));
	}
}