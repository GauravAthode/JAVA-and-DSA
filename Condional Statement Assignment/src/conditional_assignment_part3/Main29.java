package conditional_assignment_part3;

public class Main29 
{
	public static int insurance(int age, String health)
	{
		if(age<30 && health=="Good")
		{
			return 500; 
		}
		else if(age<30 && health=="Poor")
		{
			return 1000;
		}
		else if(age>=30&&age<50&&health=="Good")
		{
			return 1200;
		}
		else if(age>=30&&age<50&&health=="Poor")
		{
			return 2000;
		}
		else if(age>=50&&health=="Good")
		{
			return 3000;
		}
		else 
		{
			return -1;
		}
	}
	public static void main(String[] args) 
	{
		int age = 49;
		String  health ="Poor";
		int premium=(insurance(age,health));
		if(premium==-1)
		{
			System.out.println("Not eligible for insurance");
		}
		else 
		{
			System.out.println("₹"+premium);
		}
	}

}
