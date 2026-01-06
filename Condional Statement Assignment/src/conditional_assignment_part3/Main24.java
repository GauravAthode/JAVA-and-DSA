package conditional_assignment_part3;

public class Main24 
{
	public static double  grossSalary(int basicSalary) 
	{
		if(basicSalary<1500)
		{
			double hra=basicSalary*10/100;
			double da=basicSalary*90/100;
			double grossSalary=basicSalary+hra+da;
			return grossSalary;
		}
		else 
		{
			double hra=500;
			double da=basicSalary*98/100;
			double grossSalary=basicSalary+hra+da;
			return grossSalary;
		}
	}

	public static void main(String[] args) 
	{
		int basicSalary=1500;
		double grossSalary=grossSalary(basicSalary);
		System.out.println("Gross Salary = "+grossSalary );	
	}
}
