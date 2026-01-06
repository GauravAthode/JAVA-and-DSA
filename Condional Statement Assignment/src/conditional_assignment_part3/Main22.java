package conditional_assignment_part3;

public class Main22 
{
	public static double ratingA(double salary)
	{
		int yearsofservice = 10;    // input
		if(yearsofservice>10)
		{
			double bonus = salary*20/100;
			return bonus;
		}
		else if(yearsofservice>=5&&yearsofservice<=10)
		{
			double bonus = salary*15/100;
			return bonus;
		}
		else 
		{
			return 0;
		}	
	}
	
	public static double ratingB(double salary)
	{
		String jobLevel ="junior";   // input
		if(jobLevel== "senior")
		{
			double bonus= salary*12/100;
			return bonus;
		}
		else 
		{
			double bonus= salary*8/100;
			return bonus;
		}
	}
	
	public static void main(String[] args) 
	{
		double salary = 50000;
		char performanceRating = 'A';    // input
		if(performanceRating == 'A')
		{
			double bonus=ratingA(salary);
			if(bonus==0)
			{
				System.out.println("Bonus = "+bonus);
				System.out.println("Final Salary = "+salary);
			}
			else 
			{	   
				System.out.println("Bonus = "+bonus);
				System.out.println("Final Salary = "+(bonus+salary));
			}
		}
		else if(performanceRating == 'B')
		{
			double bonus = ratingB(salary);
			System.out.println("Bonus = "+bonus);
			System.out.println("Final Salary = "+(bonus+salary));
		}
		else 
		{
			System.out.println("no bonus is applied");
			System.out.println("Final Salary = "+salary);
		}
	}
}
