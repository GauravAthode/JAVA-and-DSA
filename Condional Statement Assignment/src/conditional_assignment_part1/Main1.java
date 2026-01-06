package conditional_assignment_part1;

public class Main1 
{
	public static double findMax(double num1,double num2)
	{
		if(num1<num2)
		{
			return num2;	
		}
		else if(num1>num2)
		{
			return num1;
		}
		else 
		{
			return -1;
		}
		
	}

	public static void main(String[] args)
	{
		double num1=6;
		double num2=5;
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
