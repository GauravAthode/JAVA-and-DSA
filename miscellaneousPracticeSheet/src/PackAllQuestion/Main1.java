package PackAllQuestion;

public class Main1 
{
	public static double calculateBonus(int salary,int service)
	{
		if(salary>50000)
		{
			if(service>5)
			{
				double bonus= salary*10/100;
				return bonus;
			}
			else 
			{
				double bonus= salary*7/100;
				return bonus;	
			}
		}
		else 
		{
			if(service>5)
			{
				double bonus= salary*5/100;
				return bonus;	
			}
			else
			{
				double bonus= salary*3/100;
				return bonus;
			}	
		}
	}

	public static void main(String[] args) 
	{
		int salary=34888;
		int yearOfService=3;
		double finlaBonus=calculateBonus(salary,yearOfService);
		System.out.println(finlaBonus);
	}
}
