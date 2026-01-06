package conditional_assignment_part2;

public class Main20 
{
	public static void calculateGrossSalary(double salary)
	{
		System.out.println(salary<=10000? "Gross salary = "+(salary+salary*0.2+salary*0.8) : salary<=20000? "Gross Salary"+(salary+salary*0.25+salary*0.9) : "Gross Salary = "+(salary+salary*0.3+salary*0.95));
	}
	public static void main(String[] args) 
	{
		double basicSalary=8000;
		calculateGrossSalary(basicSalary);
	}
}
