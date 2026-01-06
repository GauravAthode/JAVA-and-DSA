package PackAllQuestion;

public class Main7 
{
	public static void totalSalary(String designation)
	{
		switch (designation) 
		{
		case "Manager": 
		{
			int total=90000;
			int bonus=total*25/100;
			int totalSalary=total+bonus;
			System.out.println("Total Salary : "+ totalSalary);
			break;
		}
		case "Developer": 
		{
			int total=70000;
			int bonus=total*20/100;
			int totalSalary=total+bonus;
			System.out.println("Total Salary : "+ totalSalary);
			break;
		}
		case "Tester": 
		{
			int total=55000;
			int bonus=total*15/100;
			int totalSalary=total+bonus;
			System.out.println("Total Salary : "+ totalSalary);
			break;
		}
		case "Intern": 
		{
			int total=40000;
			int bonus=total*10/100;
			int totalSalary=total+bonus;
			System.out.println("Total Salary : "+ totalSalary);
			break;
		}
		default:
			System.out.println("Watchmen");
		}
	}
	public static void main(String[] args) 
	{
		String designation="Tester";
		totalSalary(designation);
		
	}
}
