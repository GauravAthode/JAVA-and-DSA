package conditional_assignment_part3;

public class Main24 
{
	public static double calculateGrossSalary(int Salary)
	{
		return Salary<15000? Salary+Salary*0.1+Salary*0.9 : Salary+500+Salary*0.98;
	}
	public static void main(String[] args) 
	{
		int basicSalary=1200;
		double grossSalary= calculateGrossSalary(basicSalary);
		System.out.println("Gross Salary = "+ grossSalary);
	}
}
