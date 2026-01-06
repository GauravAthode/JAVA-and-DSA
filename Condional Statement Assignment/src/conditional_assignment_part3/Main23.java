package conditional_assignment_part3;

public class Main23 
{
	public static double calculateTravelBill(double kilometers)
	{
		if(kilometers<=10)
		{
			double bill=11*kilometers;
			return bill;
		}
		else if(kilometers<=100)
		{
			double a=kilometers-10;
			double bill = 10*11+a*10;
			return bill;
		}
		else
		{
			double b=kilometers-100;
			double bill=10*11+90*10+b*9;
			return bill;
		}
	}
	public static void main(String[] args) 
	{
		double kilometers=100;
		double totalBill = calculateTravelBill(kilometers);
		System.out.println("Total Bill = "+totalBill);	
	}
}
