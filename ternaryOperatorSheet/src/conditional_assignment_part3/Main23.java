package conditional_assignment_part3;

public class Main23 
{
	public static double calculateTravelBill(double kilometers)
	{
		return kilometers<=10? 11*kilometers : 
			   kilometers<=100? 10*11+(kilometers-10)*10 : 10*11+90*10+(kilometers-100)*9;
	}
	public static void main(String[] args) 
	{
		double kilometers= 100;
		double totalBill=calculateTravelBill(kilometers);
		System.out.println("Total Bill = "+totalBill);
	}
}
