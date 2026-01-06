package practiceAssignmentPart2;

public class Main1 
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
		int a=18;
		int b=32;
		System.out.println("HCF : "+hcf(a,b));
	}
}
