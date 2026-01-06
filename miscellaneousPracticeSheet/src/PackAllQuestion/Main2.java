package PackAllQuestion;

public class Main2 
{
	public static String categorized(int age,int experience)
	{
		if(age>30)
		{
			if(experience>10)
			{
				return "Veteran.";
			}
			else 
			{
				return "Experienced.";
			}
		}
		else
		{
			if(experience>5)
			{
				return "Young Experienced.";
			}
			else 
			{
				return "Novice.";
			}
		}
		
	}
	public static void main(String[] args)
	{
		int age=30;
		int experience=9;
		System.out.println(categorized(age,experience));
		
	}

}
