package PackAllQuestion;

public class Main8 
{
	public static void mealPrice(String meal)
	{
		switch (meal)
		{
		case "Breakfast": 
		{
			System.out.println(meal+": 100");
			break;
		}
		case "Lunch": 
		{
			System.out.println(meal+": 200");	
			break;
		}
		case "Dinner": 
		{
			System.out.println(meal+": 250");	
			break;
		}
		default:
			System.out.println("input error");
		}
	}

	public static void main(String[] args) 
	{
		String meal="Lunch";
		mealPrice(meal);
	}

}
