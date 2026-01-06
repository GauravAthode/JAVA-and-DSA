package starpattern_part1;

public class Main 
{

	public static void main(String[] args) 
	{
		System.out.println("Question No. 1");
		for(int i=0; i<5; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
		
		System.out.println("Question No. 2");
		for(int i=0; i<5; i++)
		{
			System.out.println("* ");
		}
		
		System.out.println("Question No. 3");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Question No. 4");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Question No. 5");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Question No. 6");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Question No. 7");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");	
			}
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Question No. 8");
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print("  ");	
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Question No. 9");
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print("  ");	
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
		
		System.out.println("Question No. 10");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}	
			System.out.println();	
		}	
	}
}

