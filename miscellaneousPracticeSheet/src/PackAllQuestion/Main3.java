package PackAllQuestion;

public class Main3 
{
	public static void eligibleCriteria(int salary,int experience)
	{
		if(salary>40000 && experience>3)
		{
			System.out.println("they are eligible for the loan.");
		}
		else if(salary>40000 && experience<=3)
		{
			System.out.println("they are eligible with a co-signer.");
		}
		else 
		{
			System.out.println("they are not eligible for the loan.");
		}
	}

	public static void main(String[] args) 
	{
		int salary=45000;
		int experience=3;
		eligibleCriteria(salary,experience);
		
	}

}
