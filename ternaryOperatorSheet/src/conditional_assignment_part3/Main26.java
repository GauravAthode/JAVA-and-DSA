package conditional_assignment_part3;

public class Main26 
{
	public static String eligibleForInsurance(String maritalStatus,String gender,int age)
	{
		return maritalStatus=="married"? "The driver is eligible for insurance" :
			   gender=="male" && age>30? "The driver is eligible for insurance" :
			   gender=="female" && age>25? "The driver is eligible for insurance":"The driver is Not eligible for insurance";  	
	}
	public static void main(String[] args) 
	{
		String maritalStatus ="unmarried";
		String gender ="male";
		int age = 21;
		System.out.println(eligibleForInsurance(maritalStatus,gender,age));
	}
}
