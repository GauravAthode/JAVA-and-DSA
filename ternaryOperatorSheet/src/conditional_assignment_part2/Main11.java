package conditional_assignment_part2;

public class Main11 
{
	public static String printWeekday(int input)
	{
		return 1==input? "Monday" : 
			   2==input? "Tuesday" : 
			   3==input? "Wednesday" : 
			   4==input? "Thursday" : 
			   5==input? "Friday" : 
			   6==input? "Saturday" : 
			   7==input? "Sunday" : "input error";		   
	}
	public static void main(String[] args) 
	{
		int input=1;
		System.out.println(printWeekday(input));
	}
}

