package conditional_assignment_part3;

public class Main28 
{
	public static double calculateBill(double amount)
	{
		return amount>=500 && amount<=1000? amount*0.05 : 
			   amount>1000 && amount<=5000? amount*0.1 : 
			   amount>5000? amount*0.15 : -1;
	}
	public static void main(String[] args) 
	{
		double purchaseAmount=8464;
		double bill= calculateBill(purchaseAmount);
		double finalBill = bill+purchaseAmount;
		System.out.println(bill==-1? "Final Bill Amount = " + purchaseAmount : "Final Bill Amount = " +finalBill);
	}
}
