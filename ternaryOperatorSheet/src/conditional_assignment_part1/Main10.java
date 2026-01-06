package conditional_assignment_part1;

public class Main10 
{
	public static void calculateProfitOrLoss(int cp, int sp)
	{
		System.out.println(sp>cp? "Profit: "+(sp-cp) : cp>sp? "Loss: "+(cp-sp) :"No Profit, No Loss");
	}
	public static void main(String[] args) 
	{
		int cp=500;
		int sp=600;
		calculateProfitOrLoss(cp,sp);
	}
}
