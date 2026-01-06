package conditional_assignment_part3;

public class Main26 
{
	public static String eligibleForInsurance(String maritalStatus, String gender, int age)
	{
		if(maritalStatus=="married")
		{
			return "The driver is eligible for insurance";
		}
		else if(gender=="male" && age>30)
		{
			return "The driver is eligible for insurance";
		}
		else if(gender=="female" && age>25)
		{
			return "The driver is eligible for insurance";	
		}
		else
		{
			return "The driver is Not eligible for insurance";	
		}
		
	}
	public static void main(String[] args) 
	{
		String maritalStatus ="unmarried";
		String gender ="male";
		int age = 21;
		System.out.println(eligibleForInsurance(maritalStatus,gender,age));
			
	}
}
