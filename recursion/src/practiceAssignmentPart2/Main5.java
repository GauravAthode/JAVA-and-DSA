package practiceAssignmentPart2;

public class Main5 
{
	public static int nthTerm(int a,int n,int d )
	{
		if(n==1)
		{
			return a;
		}
		return nthTerm(a, n-1, d)+d;
	}

	public static void main(String[] args) 
	{  
		int a=3;
		int n=5;
		int d=2;
		System.out.println(nthTerm(a,n,d));
	}
}
