package conditional_assignment_part2;

public class Main12 
{
	public static String printMonthName(int input)
	{
		return 1==input? "january" : 
			2==input? "february" :
			3==input? "march" : 
			4==input? "april" : 
			5==input? "may" : 
			6==input? "june" : 
			7==input? "july" : 
			8==input? "august" : 
			9==input? "september" : 
			10==input? "october" : 
			11==input? "november" :
			12==input? "december" : "input error";
	}

	public static void main(String[] args) 
	{
		int input=6;
		System.out.println(printMonthName(input));
	}
}