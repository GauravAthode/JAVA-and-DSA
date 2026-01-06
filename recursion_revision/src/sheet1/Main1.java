package sheet1;


public class Main1 
{
	//Question1
	public static void printIncreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		printIncreasing(n-1);
		System.out.print(n+" ");
	}
	
	public static void printDecreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		System.out.print(n+" ");
		printDecreasing(n-1);
	}
	
	public static void increasingDecreasing(int n)
	{
		if(n==0)
		{
			return;
		}
		increasingDecreasing(n-1);
		System.out.print(n+" ");
	}

	public static void main(String[] args)
	{
//		int n=5;
//		printIncreasing(n);
		
		
//		int n=5;
//		printDecreasing(n);
		
		int n=3;
		increasingDecreasing(n);
		
		
	}

}
