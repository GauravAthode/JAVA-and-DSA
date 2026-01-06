package conditional_assignment_part1;

public class Main1 
{
	public static double findMax(double num1,double num2)
	{
		return num1<num2? num2 : 
			   num1>num2? num1 : -1;	
	}
	public static void main(String[] args)
	{
		double num1=6;
		double num2=2;
		double ans= findMax(num1,num2);
		if(ans==-1)
		{
			System.out.println("Both number are equal");
		}
		else 
		{
			System.out.println(ans);
		}
	}
}
