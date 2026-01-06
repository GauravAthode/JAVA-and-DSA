package conditional_assignment_part1;

public class Main10 
{
	public static void calculateProfitOrLoss(int cp, int sp)
	{
		if(sp>cp)
		{
			int profit=sp-cp;
			System.out.println("Profit: "+profit);
		}
		else if(cp>sp)
		{
			int loss=cp-sp;
			System.out.println("Loss: "+ loss);
		}
		else 
		{
			System.out.println("No Profit, No Loss");
		}	
	}

	public static void main(String[] args) 
	{
		int cp=500;
		int sp=600;
		calculateProfitOrLoss(cp,sp);
	}
}
