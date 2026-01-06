package practiceAssignmentPart1;

public class Main8 
{
	public static int count(int n,int i)
	{
		if(n==0)
		{
			return i;
		}
		n/=10;
		i+=1;
		return count(n,i);
	}
	public static void main(String[] args) 
	{
		int n=1834;
		System.out.println(count(n,0));
	}
}
