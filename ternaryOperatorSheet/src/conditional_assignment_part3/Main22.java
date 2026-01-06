package conditional_assignment_part3;

public class Main22 
{
	public static double ratingA(double salary)
	{
		int yearsofservice = 10;  //input
		return yearsofservice>10? salary*0.2 : 
			   yearsofservice>=5&&yearsofservice<=10? salary*0.15 : 0;
	}
	
	public static double ratingB(double salary)
	{
		String jobLevel ="junior";   // input
		return jobLevel== "senior"? salary*0.12 : salary*0.08;
	}
	
	public static void main(String[] args) 
	{
		double salary = 50000;
		char performanceRating = 'A';    // input
		double bonus = performanceRating == 'A'? ratingA(salary) : 
			           performanceRating == 'B'? ratingB(salary) : 0;
		System.out.println("Bonus = "+bonus);
		System.out.println("Final Salary = "+(bonus+salary));
	}
}
