package conditional_assignment_part3;

public class Main21 
{
	public static double findTotalElectricity(Double unit)
	{
		if(unit<=50)
		{
			Double bill = unit*0.50;
			return bill;
		}
		else if(unit<=200)
		{
			double a = unit-50;
			double bill = 50*0.50+a*0.75;
			return bill;
		}
		else if(unit<=450)
		{
			double b = unit-200;
			double bill = 50*0.50+150*0.75+b*1.20;
			return bill;	
		}
		else
		{
			double c = unit-450;
			double bill = 50*0.50+150*0.75+250*1.20+c*1.50;
			return bill;	
		}
	}
	public static void main(String[] args) 
	{
		double unit = 233;
		double result = findTotalElectricity(unit);
		double surcharge = result*20/100;
		double total = result+surcharge;
		System.out.println(total);
		
	}

}
