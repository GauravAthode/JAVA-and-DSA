package conditional_assignment_part1;

public class Main2 
{
	public static double findMax(double n1,double n2, double n3)
	{
		if(n1>n2&&n1>n3)
		{
			return n1;
		}
		else if(n2>n3)
		{
			return n2;
		}
		else if(n3>n2)
		{
			return n3;
		}
		else 
		{
			return -1;
		}
	}
	public static void main(String[] args) 
	{
		double n1=4;
		double n2=2;
		double n3=1;
		double ans =findMax(n1,n2,n3);
		if(ans==-1)
		{
			System.out.println("All numbers are equal");
		}
		else
		{
			System.out.println(ans);
		}
	}

}
