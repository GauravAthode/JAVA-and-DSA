package conditional_assignment_part3;

public class Main28 
{
	public static double calculateBill(double amount)
	{
		if(amount>=500 && amount<=1000)
		{
			double bill = amount*5/100;
			return bill;
		}
		else if(amount>1000 && amount<=5000)
		{
			double bill = amount*10/100;
			return bill;
		}
		else if(amount>5000)
		{
			double bill = amount*15/100;
			return bill;
		}
		else 
		{
			return -1;
		}
	}
	public static void main(String[] args) 
	{
		double purchaseAmount=8464;
		double bill= calculateBill(purchaseAmount);
		double finalBill = bill+purchaseAmount;
		if(bill==-1)
		{
			System.out.println("no discount is applicable");
			System.out.println("Final Bill Amount = "+purchaseAmount);
		}
		else 
		{
			System.out.println("discount is applicable = "+bill);
			System.out.println("Final Bill Amount = "+finalBill);
		}
	}
}
