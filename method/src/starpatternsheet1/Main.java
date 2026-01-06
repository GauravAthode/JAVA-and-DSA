package starpatternsheet1;

public class Main 
{
	public static void question1()
	{
		System.out.println("Question No. 1");
		for(int i=0; i<5; i++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
	public static void question2()
	{
		System.out.println("Question No. 2");
		for(int i=0; i<5; i++)
		{
			System.out.println("* ");
		}
	}
	public static void question3()
	{
		System.out.println("Question No. 3");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void question4() 
	{
		System.out.println("Question No. 4");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void question5() 
	{
		System.out.println("Question No. 5");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void question6()
	{
		System.out.println("Question No. 6");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void question7()
	{
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
	}
	public static void question8() 
	{
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
	}
	public static void question9() 
	{
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
	}
	public static void question10() 
	{
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
	
	public static void main(String[] args) 
	{
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question9();
		question10();
	}

}
