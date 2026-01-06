package practiceAssignmentPart2;

public class Main2 
{
	public static int hcf(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return hcf(b,a%b);
	}
	public static void main(String[] args) 
	{
		int a=15;
		int b=20;
		int product=a*b;
		int hcf=hcf(a,b);
		int lcm=product/hcf;
		System.out.println("LCM : "+lcm);
	}
}
