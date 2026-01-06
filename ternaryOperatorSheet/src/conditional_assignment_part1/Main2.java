package conditional_assignment_part1;

public class Main2 
{
	public static double findMax(double n1,double n2, double n3)
	{	
		return n1>n2&&n1>n3? n1 : 
			   n2>n3&&n2>n1? n2 : 
			   n3>n2&&n3>n1? n3 : -1;
	}
	public static void main(String[] args) 
	{
		double n1=4;
		double n2=5;
		double n3=4;
		double ans =findMax(n1,n2,n3);
		System.out.println(ans==-1? "All numbers are equal" : ans);
	}

}

