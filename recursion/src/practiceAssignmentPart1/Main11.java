package practiceAssignmentPart1;


public class Main11 
{
	public static boolean isPrime(int n,int i)
	{
		if(n<=1)
		{
			return false;
		}
		if(i*i>n)
		{
			return true;
		}
		if(n%i==0)
		{
			return false;
		}
		return isPrime(n, i+1);
	}

	public static void main(String[] args) 
	{
		int n=5;
		if(isPrime(n,2))
		{
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+ " is not a prime number");
		}
	}	
}
