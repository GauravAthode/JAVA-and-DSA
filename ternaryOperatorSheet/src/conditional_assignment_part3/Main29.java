package conditional_assignment_part3;

public class Main29 
{
	public static int insurance(int age, String health)
	{
		return age<30 && health=="Good"? 500 : 
			   age<30 && health=="Poor"? 1000 : 
			   age>=30&&age<50&&health=="Good"? 1200 : 
			   age>=30&&age<50&&health=="Poor"? 2000 : 
			   age>=50&&health=="Good"? 3000:-1; 	
	}
	public static void main(String[] args) 
	{
		int age = 49;
		String  health ="Poor";
		int premium=(insurance(age,health));
		System.out.println(premium==-1? "Not eligible for insurance" : "₹"+premium);
	}
}
