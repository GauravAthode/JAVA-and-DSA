package conditional_assignment_part3;

public class Main27 
{
	public static int salary(String gender,int year,String qualifications)
	{
		return gender == "Male"? year>=10 && qualifications=="post-graduate"? 15000 : 
			                     year>=10 && qualifications=="Graduate"? 10000 : 
			                     year>10 && qualifications=="Post-Graduate"? 10000 : 7000 : 
			   year>=10 && qualifications=="post-graduate"? 12000 : 
			   year>=10 && qualifications=="Graduate"? 9000 : 
			   year<10 && qualifications=="post-graduate"? 10000 : 6000;  	
	}
	public static void main(String[] args) 
	{
		String gender="Male";
		int yearsOfService=10;
		String qualifications="Graduate";
		System.out.println(salary(gender,yearsOfService,qualifications));
	}
}
