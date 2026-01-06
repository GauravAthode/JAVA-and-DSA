package conditional_assignment_part1;

public class Main3
{
	public static String findyoungest(int rohan,int harsh,int anjali)
	{
		if(rohan<harsh&&rohan<anjali)
		{
			System.out.println("Anjali is the youngest wiith an age of"+rohan);
			return "Anjali";
			
		}
		else if(harsh<anjali)
		{
			System.out.println("Anjali is the youngest wiith an age of "+rohan);
			return "Rohan";
		}
		else
		{
			System.out.println("Anjali is the youngest wiith an age of"+ anjali);
			return "Anjali";
		}
		
	}

	public static void main(String[] args) 
	{
		int rohan = 25;
		int harsh = 30;
		int anjali =22;
		findyoungest(rohan,harsh,anjali);

	}
}
