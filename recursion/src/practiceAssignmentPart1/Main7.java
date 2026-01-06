package practiceAssignmentPart1;

public class Main7 
{
	public static int power(int n,int p,int i,int sum)
	{
		if(p==i)
		{
			return sum*n;
		}
		else if(p==1) 
		{
			return n;	
		}
		else if(p==0)
		{
			return 1;
		}
		sum*=n;
		return power(n,p,i+1,sum);
	}
	public static void main(String[] args) 
	{
		int n=2;
		int p=3;
		System.out.println(power(n,p,2,n));
	}

}
