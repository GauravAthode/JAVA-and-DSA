package conditional_assignment_part3;

public class Main30 
{
	public static int ticketPrice(int age,String day)
	{
		return age<5? -1 : 
			   age>=5 && age<18? day=="Sunday"||day=="Saturaday"? 1500 : 1000 : 
			   age>=18&&age<60? day=="Sunday"||day=="Saturaday"? 2000 : 1500 : 
			   day=="Sunday"||day=="Saturaday"? 750 :-1; 
	}
	public static void main(String[] args) 
	{
		int age=25;
		String dayOfWeek="Monday";
		int price = ticketPrice(age,dayOfWeek);
		System.out.println(price==-1? "Free" : "₹"+price);
	}
}
