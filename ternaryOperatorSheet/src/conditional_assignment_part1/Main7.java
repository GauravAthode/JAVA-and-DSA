package conditional_assignment_part1;

public class Main7 
{
	public static String checkCharType(int input)
	{
		return 97<=input&&122>=input|| 65<=input&& 90>=input? "Alphabet" : 
			   48<=input&&57>=input?  "Digit" : "Special character"; 
	}
	public static void main(String[] args) 
	{
		int input = '*';
		System.out.println(checkCharType(input));
	}
}