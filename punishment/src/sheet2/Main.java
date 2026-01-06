package sheet2;

public class Main 
{
	public static void q11()
	{
		System.out.println("q11");
		for(int i=0; i<5;i++)
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
		for(int i=0; i<4; i++)
		{
			for(int j=0 ; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i ; j<4; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
			
	}
	public static void q12()
	{
		System.out.println("q12");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
		
		System.out.println();	
		}
		for( int i=0; i<4; i++)
		{
			for(int j=i; j<4; j++ )
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	public static void q13() 
	{
		System.out.println("q13");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for (int j=i; j<5; j++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
		for(int i=0; i<4; i++)
		{
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for (int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}	
	}
	public static void q14() 
	{
		System.out.println("q14");
		for(int i=0; i<5;i++)
		{
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=0; i<4; i++)
		{
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}	
	}
	public static void q15()
	{
		System.out.println("q15");
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
			for(int j=i;j<5; j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print("  ");
			}
			for(int j=0 ; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			
		System.out.println();
		}
		
	}
	public static void q16()
	{
		System.out.println("q16");
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
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
	public static void q17()
	{
		System.out.println("q17");
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
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("* ");
			}
		System.out.println();	
		}
	}
	public static void q18()
	{
		System.out.println("q18");
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("  ");
			}
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
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void q19()
	{
		System.out.println("q19");
		for(int i=0; i<5;i++)
		{
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
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
		for(int i=0; i<4; i++)
		{
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void q20()
	{
		System.out.println("q20");
		for(int i=0; i<5;i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
		for(int i=0; i<4; i++)
		{
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
		System.out.println();
		}
	}
	public static void q21()
	{
		System.out.println("q21");
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
			for(int j=i; j<4; j++)
			{
				System.out.print("  ");
			}
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
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
			for (int j=i; j<3; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<4; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
	public static void q22()
	{
		System.out.println("q22");
		for(int i=0; i<5; i++)
		{
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
			}
			for(int j=i ; j<5; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<5; j++)
			{
				System.out.print("* ");
			}
			for(int j=0; j<i; j++)
			{
				System.out.print("  ");
				
			}
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
		for(int i=0; i<4; i++)
		{
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=i; j<3; j++)
			{
				System.out.print("  ");
			}
			for(int j=-1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) 
	{
		q11();
		System.out.println();
		q12();
		System.out.println();
		q13();
		System.out.println();
		q14();
		System.out.println();
		q15();
		System.out.println();
		q16();
		System.out.println();
		q17();
		System.out.println();
		q18();
		System.out.println();
		q19();
		System.out.println();
		q20();
		System.out.println();
		q21();
		System.out.println();
		q22();
		System.out.println();
	}

}
