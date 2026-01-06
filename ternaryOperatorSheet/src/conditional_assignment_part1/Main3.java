package conditional_assignment_part1;

public class Main3 
{
	public static String findyoungest(int rohan,int harsh,int anjali)
	{
		return rohan<harsh&&rohan<anjali? "Rohan is the youngest wiith an age of "+rohan : 
			   harsh<anjali&&harsh<rohan? "Harsh is the youngest wiith an age of "+harsh : "Anjali is the youngest wiith an age of "+anjali;	
	}

	public static void main(String[] args) 
	{
		int rohan = 20;
		int harsh = 30;
		int anjali =22;
		System.out.println(findyoungest(rohan,harsh,anjali));

	}
}

