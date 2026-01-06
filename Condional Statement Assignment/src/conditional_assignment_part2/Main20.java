package conditional_assignment_part2;

public class Main20 
{
	public static void calculateGrossSalary(Double basicsalary)
	{
		if(basicsalary<=10000)
		{
			 double HRA = basicsalary*20/100;
			 double DA = basicsalary*80/100;
			 Double Totalsalary=basicsalary+HRA+DA;
			 System.out.println("Gross Salary = "+Totalsalary);	 
		}
		else if(basicsalary<=20000)
		{
			 double HRA = basicsalary*25/100;
			 double DA = basicsalary*90/100;
			 Double Totalsalary=basicsalary+HRA+DA;
			 System.out.println("Gross Salary = "+Totalsalary);	 
		}
		else 
		{
			double HRA = basicsalary*30/100;
			 double DA = basicsalary*95/100;
			 Double Totalsalary=basicsalary+HRA+DA;
			 System.out.println("Gross Salary = "+Totalsalary);
		}
	}
	public static void main(String[] args) 
	{
		double basicsalary=8000.00;
		calculateGrossSalary(basicsalary);
	}
}
