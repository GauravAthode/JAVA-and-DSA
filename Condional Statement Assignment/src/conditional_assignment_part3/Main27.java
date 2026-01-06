package conditional_assignment_part3;

public class Main27 
{
	public static int  salary(String gender,int year,String qualifications)
	{
		if(gender=="male")
		{
			if(year>=10 && qualifications=="post-graduate")
			{
				return 15000;
			}
			else if(year>=10 && qualifications=="graduate")
			{
				return 10000;
			}
			else if(year<10 && qualifications=="post-graduate")
			{
				return 10000;
			}
			else
			{
				return 7000;
			}
		}
		else 
		{
			if(year>=10 && qualifications=="post-graduate")
			{
				return 12000;
			}
			else if(year>=10 && qualifications=="graduate")
			{
				return 9000;
			}
			else if(year<10 && qualifications=="post-graduate")
			{
				return 10000;
			}
			else
			{
				return 6000;
			}
		}
	}

	public static void main(String[] args) 
	{
		String gender ="female";
		int yearOfService=12;
		String qualifications="post-graduate";
		System.out.println(salary(gender,yearOfService,qualifications));
	}

}
