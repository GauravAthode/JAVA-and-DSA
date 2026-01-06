package conditional_assignment_part3;

public class Main21 
{
	public static double findTotalElectricity(Double unit)
	{
		return unit<=50? unit*0.50 : 
			   unit<=200? 50*0.50+(unit-50)*0.75 : 
			   unit<=450? 50*0.50+150*0.75+(unit-200)*1.20 : 50*0.50+150*0.75+250*1.20+(unit-450)*1.50;
	}
	public static void main(String[] args) 
	{
		double unit = 300;
		double result = findTotalElectricity(unit);
		double surcharge = result*20/100;
		double total = result+surcharge;
		System.out.println(total);
	}
}
