package conditional_assignment_part3;

public class Main30 
{
	public static int ticketPrice(int age,String day)
	{
		if(age<5)
		{
			return -1;
		}
		else if(age>=5 && age<18)
		{
			if(day=="Sunday"||day=="Saturaday")
			{
				return 1500;
			}
			else 
			{
				return 1000;
			}
		}
		else if(age>=18&&age<60)
		{
			if(day=="Sunday"||day=="Saturaday")
			{
				return 2000;
			}
			else 
			{
				return 1500;
			}
		}
		else 
		{
			if(day=="Sunday"||day=="Saturaday")
			{
				return 750;
			}
			else 
			{
				return -1;
			}
		}
	}
	public static void main(String[] args) 
	{
		int age=25;
		String dayOfWeek="Monday";
		int price = ticketPrice(age,dayOfWeek);
		if(price==-1)
		{
			System.out.println("Free");
		}
		else 
		{
			System.out.println("₹"+price);
		}
	}
}
